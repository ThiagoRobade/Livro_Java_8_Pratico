package br.com.livro.capitulo2;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Vamos manipular alguns usuários, com nomes e pontos diferentes, e imprimir cada um deles.

/*
Criamos uma classe que implementa essa nova interface do Java 8. Ela é bem
trivial, possuindo o único método accept responsável por pegar um objeto do tipo
Usuario e consumi-lo. ‘Consumir’ aqui é realizar alguma tarefa que faça sentido
para você. No nosso caso, é mostrar o nome do usuário na saída padrão. Depois
disso, podemos instanciar essa classe e passar a referência para o esperado método
forEach:
*/

public class Capitulo2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for (Usuario u : usuarios) {
            System.out.println(u.getNome());
        }
        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario p) {
                System.out.println(p.getNome());
            }
        });

        usuarios.forEach(u -> System.out.println(u.getNome()));

        usuarios.forEach(u -> u.tornaModerador());

    }
}












