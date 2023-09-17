package br.edu.ifsp.list01;

import java.util.Arrays;
import java.util.Scanner;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/
public class Ex05 {

    public static void main(String[] args) {
        //Leia o input
        Scanner scanner =new Scanner(System.in);

        System.out.println("limite L:");
        int limite = scanner.nextInt();

        System.out.println("Valor da multa:");
        double multa = scanner.nextDouble();

        System.out.println("Valor adicional:");
        double adicional = scanner.nextDouble();

        System.out.println("velocidade:");
       int  velocidade = scanner.nextInt();

        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex05 ex = new Ex05();
        //Escreva o resultado da chamada do método compute() aqui
        String result ;
          result = ex.compute(limite,multa, adicional,velocidade);
      //  System.out.printf("Resultado: %.2f\n", result);
        String resul = result.replace(",",".");
        System.out.printf("%.2f", Double.parseDouble(resul));


    }

    String compute(int L, double m, double a, int v) {
         int acimaDoLimite =  acimaDoLimite = v - L;;
          if(v > L){
              m += acimaDoLimite * a;
              return String.format("%.2f",m);
          }
         return "0.00";




    }
}
