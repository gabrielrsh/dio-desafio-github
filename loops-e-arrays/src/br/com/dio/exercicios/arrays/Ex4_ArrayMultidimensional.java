package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
* Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios
* entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).
* */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random random = new Random();
        int menorNumero=10, posLinha=-1, posColuna = -1;

        for(int i=0; i<M.length; i++){
            for (int j=0; j< M[i].length; j++){
                M[i][j] = random.nextInt(0,9);
                if(M[i][j]< menorNumero){
                    menorNumero = M[i][j];
                    posLinha = i;
                    posColuna = j;
                }
            }
        }

        for (int[] linha: M) {
            for(int numero: linha){
                System.out.print(numero+" ");
            }
            System.out.println();
        }
        System.out.println("Menor valor:"+menorNumero+" posição("+(posLinha+1)+", "+(posColuna+1)+")");
    }
}
