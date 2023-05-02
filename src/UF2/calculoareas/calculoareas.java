package UF2.calculoareas;

import java.util.Scanner;
public class calculoareas {
    private String figura = "";
    private double area = 0;
    public static void main(String args[]) {
        calculoareas programa = new calculoareas();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        figura();
        calcular();
        imprimir();
    }

    public void imprimir() {
        //fem el system out per imprimir a terminal
        System.out.println("L'area del " + figura + " es " + area);
    }

    public void calcular() {

        if (figura.equals("triangle")) {
            double b = 23.0;
            double h = 8.0;
            triangle(b,h);
        }

        //cas en que la figura = "quadrat"
        else if (figura.equals("quadrat")) {
            double r = 37.0;
            quadrat(r);
        }

        //cas en que la figura = "rectangle"
        else if (figura.equals("rectangle")) {
            double a = 68.0;
            double b = 39.0;
            rectangle(a,b);
        }

        //cas en que la figura = "trapezi"
        else if (figura.equals("trapezi")) {
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;
            trapezi(a,b,h);
        }

        //cas en que la figura = "rombe"
        else if (figura.equals("rombe")) {
            double dM = 75.0;
            double dm = 30.0;
            rombe(dM,dm);
        }

        //cas en que la figura = "paralelogram"
        else if (figura.equals("paralelogram")) {
            double b = 45.0;
            double h = 13.0;
            paralelogram(b,h);
        }

        //cas en que la figura = "cercle"
        else if (figura.equals("cercle")) {
            System.out.println("Quin es el radi del cercle?");
            double r = 5;
            //funció matemàtica que eleva a 2 el radi
            //Math.PI = nombre pi (3.14159....)
            cercle(r);
        }
    }

    public void triangle(double b, double h) {
        area = (b * h) / 2;
    }
    public void quadrat(double r) {
        area = Math.pow(r, 2);
    }
    public void rectangle(double a, double b) {
        area = a * b;
    }
    public void trapezi(double a, double b, double h) {
        area = ((a * b) * h) / 2;
    }
    public void rombe(double dM, double dm) {
        area = (dM * dm) / 2;
    }
    public void paralelogram(double b, double h) {
        area = b * h;
    }
    public void cercle(double r) {
        area = Math.pow(r, 2) * Math.PI;
    }

    public void figura() {
        Scanner s = new Scanner(System.in);
        figura = s.nextLine();
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
    }
    //declarem l'objecte Scanner per a poder recolir dades de la temrinal
   /*

    //demanen a l'usuari la figura que vol calcular l'àera


    //recollim la dada entrada per terminal


    //definim les variables que utilitzarem en tots els casos
    double area = 0;

    //cas en que la figura = "triangle"

    }*/


}
