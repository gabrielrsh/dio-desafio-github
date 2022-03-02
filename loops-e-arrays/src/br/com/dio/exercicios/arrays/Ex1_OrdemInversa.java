package br.com.dio.exercicios.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
* */
public class Ex1_OrdemInversa {
    public static void main(String[] args) throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int i=0;

        do {
            try {
                System.out.println("Digite o "+(i+1)+"º numero do vetor:");
                numeros[i] = scan.nextInt();
                i++;
            } catch (InputMismatchException e){
                scan.next();
                System.out.println("Valor invalido!\n");
            }
        } while (i < numeros.length);

        for(int j = numeros.length-1; j >= 0; j--){
            System.out.print(numeros[j]+" | ");
        }
    }
}
