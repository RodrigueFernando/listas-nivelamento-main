package br.edu.ifsp.list01;

/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/

import java.util.Scanner;

public class Ex02 {


    public static void main(String[] args) {
        // Cria um objeto para ler da entrada padrão
        Scanner scanner = new Scanner(System.in);

        //Leia o input
        //System.out.print("A:");
        int a = scanner.nextInt();

        //System.out.print("B:");
        int b = scanner.nextInt();

        //System.out.print("C:");
        int c = scanner.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        String result = ex.compute(a, b, c);
        System.out.println("Saida:" + result);

    }

    String compute(int a, int b, int c) {
        String output = null;
        //put your logic here

        if (a <= 0 || b <= 0 || c <= 0) return output = "Erro";
        if (a + b <= c || c + a <= b || c + b <= a) return output = "Nao forma triangulo";
        if (a == b && b == c) return output = "Equilatero";
        if(a == b || b == c || a == c) return output = "Isosceles";

        //ctrol + j

        return output = "Escaleno";

    }

}