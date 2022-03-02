package br.com.dio.exercicios.loops;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.OptionalDouble;
import java.util.Scanner;

/* DO_WHILE
* Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
* */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) throws InputMismatchException {
        double maximo, media;
        double numeros[] = new double[5];
        int i = 0;
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println("Digite o " + (i + 1) + "º numero:");
                numeros[i] = scan.nextDouble();
                i++;
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Valor informado inválido");
            }
        }while(i < 5);

        maximo = Arrays.stream(numeros).max().getAsDouble();
        media = Arrays.stream(numeros).average().getAsDouble();

        System.out.println("O maior número é: "+ maximo);
        System.out.println("\nA média dos números é: "+ media);
    }
}
