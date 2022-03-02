package metodos.aula01;
//Calcula valor final de um produto com base no número de parcelas e uma taxa arbitrária

public class Emprestimo {

    private static double getTaxa(int numeroParcelas){
        return 0.15*numeroParcelas;
    }

    public static void calcularValorFinal(double valor, int parcelas){
        valor += valor * getTaxa(parcelas);
        System.out.println("Para "+parcelas+" parcelas o valor final é "+ valor);
    }
}
