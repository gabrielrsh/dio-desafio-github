package metodos.aula01;

import metodos.aula02.Quadrilatero;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, valorProduto;
        int parcelas;
        //Mensagem
        Mensagem.enviaMensagem(LocalDateTime.now().getHour());

        //Calculadora
        System.out.println("Digite o 1º número:");
        n1 = scan.nextDouble();

        System.out.println("Digite o 2º número:");
        n2 = scan.nextDouble();

        Calculadora.soma(n1, n2);
        Calculadora.subtracao(n1, n2);
        Calculadora.multiplicacao(n1, n2);
        Calculadora.divisao(n1, n2);

        //Emprestimo
        System.out.println("Digite o valor do produto:");
        valorProduto = scan.nextDouble();

        System.out.println("Digite o numero de parcelas:");
        parcelas = scan.nextInt();
        Emprestimo.calcularValorFinal(valorProduto, parcelas);

        //Area do Quadrilatero
        Quadrilatero.area(2);
        Quadrilatero.area(2, 3);
        Quadrilatero.area(1,2,3);

    }
}
