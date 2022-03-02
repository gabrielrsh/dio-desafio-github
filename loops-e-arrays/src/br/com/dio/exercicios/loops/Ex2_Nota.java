package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*  WHILE
* Nota: Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido e continue
* pedindo até que o usuário informe um valor válido.
* */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;

        while(true){
            System.out.println("Digite uma nota de 0 à 10:");

            if(scan.hasNextDouble()) {
                nota = scan.nextDouble();

                if(nota >= 0 && nota <= 10)
                    break;
            }
            else
                scan.next();

            System.out.println("Valor inválido!\n");
        }
    }
}
