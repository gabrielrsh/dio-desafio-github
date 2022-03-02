package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* DO_WHILE
* Par e Ímpar: Faça um programa que peça N números inteiros.
* Calcule e mostre a quantidade de números pares e a quantidade de números impares.
* */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumeros, numero;
        int contador=0, qtdPares=0, qtdImpares=0;

        System.out.println("Digite a quantidade de números:");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Digite o " + (contador+1)+"º número");
            numero = scan.nextInt();

            if(numero%2==0) qtdPares++;
            else qtdImpares++;

            contador++;

        } while(contador < quantidadeNumeros);

        System.out.println("Qtd. Pares: "+qtdPares+"\nQtd.Impares: "+qtdImpares);
    }
}
