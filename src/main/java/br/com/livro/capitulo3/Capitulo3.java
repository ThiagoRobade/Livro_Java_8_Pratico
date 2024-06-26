package br.com.livro.capitulo3;

class Capitulo3 {

    // Definição da interface Validador
    interface Validador<T> {
        boolean valida(T valor);
    }

    public static void main(String[] args) {
        // Primeira Thread usando classe anônima
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();

        // Segunda Thread usando lambda
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        }).start();

        // Validador de CEP usando classe anônima
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        // Validador de CEP usando lambda
        Validador<String> validadorCEPComLambda = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        // Exemplo de uso do Runnable com lambda
        Runnable o = () -> {
            System.out.println("O que sou eu? Que lambda?");
        };

        System.out.println(o);
        System.out.println(o.getClass());
    }
}
