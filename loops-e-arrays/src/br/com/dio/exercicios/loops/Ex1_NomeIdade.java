package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*  WHILE
 * Nome e Idade: Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 * */
public class Ex1_NomeIdade {
    public static void main(String[] args) {
        String nome="",idade;

        Scanner scan = new Scanner(System.in);

        while(!nome.equals("0")){
            System.out.println("Digite um nome:");
            nome = scan.next();
            System.out.println("Digite a idade:");
            idade = scan.next();
        }

    }

}
