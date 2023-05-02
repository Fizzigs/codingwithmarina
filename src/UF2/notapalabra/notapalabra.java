package UF2.notapalabra;


import java.util.Scanner;

public class notapalabra {
    double nota = 0;
    String notatexto = "";
    private Scanner scanner1 = new Scanner (System.in);

    public static void main (String[] args) {
        notapalabra programa = new notapalabra();
        programa.inici();
    }

    public void inici() {
        datos();
        calculonota();
        imprimirnota();
    }

    private void imprimirnota() {
        System.out.println(notatexto);
    }


    private void datos() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("Escribe una nota?\n");
        nota = scanner1.nextDouble();
    }
    private void calculonota() {

        if ((nota <=10) && (nota>=9)){
            notatexto = "Excelente";
        }
        else if ((nota <=8.9) && (nota>=6.5)){
            notatexto =  "Notable";

        }

        else if ((nota <=4.9) && (nota>=0)){
            notatexto = "Suspenso";

        }
        else{
            notatexto = "nota no valida";
        }

    }
}