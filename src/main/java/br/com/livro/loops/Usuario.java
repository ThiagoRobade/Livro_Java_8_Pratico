package br.com.livro.loops;

// Loops da maneira antiga.

/*Vamos criar uma entidade para poder rodar exemplos baseados nela.
 Teremos a classe Usuário, com três atributos básicos:
 pontos, nome e um boolean moderador, indicando se aquele usuário é
 um moderador do nosso sistema.
 */
public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario(String nome, int pontos) {
        this.pontos = pontos;
        this.nome = nome;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
}

















