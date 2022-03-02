package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* FOR
* Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120
* */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        long fatorial=1;
        System.out.println("Digite o numero para saber o seu fatorial: ");
        numero = scan.nextInt();

        for(int i=numero; i>1; i--){
            fatorial *= i;
        }
        System.out.println(numero+"! = "+fatorial);
    }


}
