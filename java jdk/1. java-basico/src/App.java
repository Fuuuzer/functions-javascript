public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // para criar/ uma variável
        // int valor1 = 5;
        // int num2 = 3;
        // double preco = 17.5;
        // String nome = "Jonas";
        // boolean ligado = false;

        // === Nomes aceitos:
        // deve iniciar com letra minúscula
        // nomeDaVariavel
        // camelCase
        // nome_variavel
        // _nome

        // ------------------------------------------------------------**
        // === Não aceitos:
        // acentos
        // 1variavel
        // cedilha
        // nome-variavel (aceita em CSS (padrão))
        // não pode ter caracteres especiais como @ # ? : /

        // Sintaxe == forma de escrever

        // Semântica == o significado de uma instrução

        //

        // Java é uma linguagem de tipagem forte, ou seja,
        // é necessário informar o tipo da variável (pote)

        // exemplo de declaração de variável:

        // int numero1 = 5;
        // Leia: a variável número1, do tipo inteiro, recebe o valor 5

        // int numero2 = 4;
        // int soma = numero1 + numero2;
        // System.out.println(soma);

        /*
         * Tipos primitivos int == inteiro (5, 4, 53) double == decimal (0.74, 1.23)
         * char == caracter ('a', 'b', 'M', '7') boolean == booleano (true, false)
         */

        /*
         * Tipos Wrapper (envelope) //Integer == inteiro (5, 4, 53) Double == decimal
         * (0.74, 1.23) String == caracter ('Jonas', 'texto completo', 'M', '7') Boolean
         * == booleano (true, false)
         */

        // Converter uma String (texto) em valor numérico

        String numeroEmTexto = "23";
        Integer numInteiro1 = Integer.parseInt(numeroEmTexto);
        int numInteiro2 = 2;
        int somaInteiro = numInteiro1 + numInteiro2;

        // Atalho para systemout (syso)
        System.out.println("O resultado da soma é: " + somaInteiro);

        // Concatenar == juntar duas string com o sinal de +

        // Escreva um algoritmo que receba dois valores, some e mostre o resultado:

        // :: Programação Estruturada (Procedural) ::

        // 1. Declaração das variáveis
        // 2. Atribuição de valores (ENTRADA)
        // 3. Cálculos e validações (PROCESSAMENTO)
        // 4. Mostra o resultado na tela (SAÍDA)

        // 1. Declaração das variáveis
        int primeiroValor;
        int segundoValor;
        int somaValores;

        // 2. Atribuição de valores (ENTRADA)
        primeiroValor = 45;
        segundoValor = 5;

        // 3. Cálculos e validações (PROCESSAMENTO)
        somaValores = primeiroValor + segundoValor;

        // 4. Mostra o resultado na tela (SAÍDA)

        System.out.println("resultado " + somaValores);

        // 1. Declaração das variáveis
        double primeiraNota;
        double segundaNota;
        double terceiraNota;
        double media_notas;

        // 2. Atribuição de valores (ENTRADA)
        primeiraNota = 10;
        segundaNota = 3.5;
        terceiraNota = 6.2;

        // 3. Cálculos e validações (PROCESSAMENTO)

        media_notas = (primeiraNota + segundaNota + terceiraNota) / 3;

        // 4. Mostra o resultado na tela (SAÍDA)
        System.out.println("Média de notas: " + media_notas);

    }
}
