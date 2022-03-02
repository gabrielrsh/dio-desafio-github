package br.com.dio.exercicios.arrays;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*
* Consoantes: Faça um Programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas. Imprima as consoantes.
* */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes=0, contador=0;
        String letra;
        do {
            System.out.println("Digite a "+(contador+1)+"º letra do vetor:");
            letra = scan.next();

            if(   !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))
            ){
                consoantes[quantidadeConsoantes]= letra;
                quantidadeConsoantes++;
            }
            contador++;

        } while (contador < consoantes.length);

        System.out.println("Qtd. consoantes: " + quantidadeConsoantes);
        for(String consoante:consoantes){
            if(consoante!=null)
                System.out.print(consoante+"|");
        }
    }
}
