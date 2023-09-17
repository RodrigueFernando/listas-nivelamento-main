package br.edu.ifsp.list01;

import java.util.Map;
import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        //Leia o input
        Scanner scanner = new Scanner(System.in);
        System.out.printf("largura: ");
        double largura = scanner.nextDouble();

        System.out.printf("Altura: ");
        double altura =  scanner.nextDouble();

        System.out.printf("valor da lata:");
        double c = scanner.nextDouble();

        System.out.printf("rendimento: ");
         double m = scanner.nextDouble();


        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex06 ex = new Ex06();

        //Escreva o resultado da chamada do método compute() aqui
        String resut ="";

         resut =  ex.compute(largura,altura,c,m);
        System.out.println(resut);

    }

    String compute(double l, double a, double c, double m) {
       //  int  lata = (int) c;
          double area = l * a;
          double qtdeTinta =area /m ;
          double custoTotal  = c * Math.ceil(qtdeTinta);
        String custoTotalString = String.format("%.2f", custoTotal).replace(",", ".");

         return String.format("%.0fgit  %.2f",  Math.ceil(qtdeTinta) ,custoTotal).replace(",",".") ;

        //return Math.ceil(qtdeTinta) + " custo total " + custoTotalString;
    }
}
