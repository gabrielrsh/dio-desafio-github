package br.com.dio.exercicios.arrays;

import javax.swing.*;
import java.util.Random;
import java.util.RandomAccess;

/*
* Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
*  armazene-os num vetor.
* Ao final, mostre os números e seus sucessores.
* */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i<numeros.length; i++){
            numeros[i] = random.nextInt(0,100);
        }
        System.out.print("\nNumeros aleatorios: ");
        for (int numero: numeros) {
            System.out.print(numero+" ");
        }

        System.out.print("\nSucessores numeros aleatorios: ");
        for (int numero: numeros) {
            System.out.print((numero+1)+" ");
        }
    }
}
