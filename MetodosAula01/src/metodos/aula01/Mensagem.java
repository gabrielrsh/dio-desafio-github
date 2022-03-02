package metodos.aula01;
// Classe que envia uma mensagem de acordo com a hora do dia
public class Mensagem {


    public static void enviaMensagem(int hora){

        if(hora > 5 && hora < 13) // hora das 6h ao 12h
            bomDia();
        else if(hora > 12 && hora < 19) // hora da 13h ás 18h
            boaTarde();
        else if((hora > 18 && hora < 24) || hora < 6) // hora das 19h às 5h
            boaNoite();
        else
            System.out.println("Hora inválida");
    }


    private static void bomDia(){
        System.out.println("Bom Dia!\n");
    }

    private static void boaTarde(){
        System.out.println("Boa Tarde!\n");
    }

    private static void boaNoite(){
        System.out.println("Boa Noite!\n");
    }
}
