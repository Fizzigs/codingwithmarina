package UF2.mitjanamaximamodificado;

import java.util.Scanner;
public class mitjanamaximaoperaciones {

    public static Scanner lector = new Scanner (System.in);
    public static double[] leerArray(double[]array){
        for (int i = 0; i < array.length; i++){
            array[i] = lector.nextDouble();
        }

        return array;

    }
    public static double calcularmitjana(double[]vector){
        double mitjana = 0;

        for (int i = 0; i < vector.length; i++){
            mitjana = mitjana + vector[i];
        }
        return mitjana/vector.length;
    }
}
