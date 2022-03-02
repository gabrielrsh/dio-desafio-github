package metodos.aula02;
// Exercicio implementando sobrecaga de métodos
public class Quadrilatero {

    public static void area(double lado){
        System.out.println("A área do quadrado é: "+ lado*lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("A área do retângulo é: "+ lado1*lado2);
    }

    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.printf("A área do trapézio é: "+ (baseMenor+baseMaior)*altura / 2);
    }
}
