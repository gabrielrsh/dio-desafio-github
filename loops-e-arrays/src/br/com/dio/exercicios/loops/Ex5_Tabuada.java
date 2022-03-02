package br.com.dio.exercicios.loops;
/* FOR
* Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
* O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
* */

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada = 0;

        while(tabuada < 1 || tabuada > 10){
            System.out.println("Digite o numero da tabuada (1 á 10): ");
            tabuada = scan.nextInt();
        }
        System.out.println("Tabuada de"+tabuada+":\n");
        for(int i=1; i<=10; i++){
            System.out.println(tabuada+" X "+i+" = "+tabuada*i+"\n");
        }
    }
}
