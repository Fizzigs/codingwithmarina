package UF2.CercaValors;

import java.util.Arrays;
import java.util.Random;


public class CercaValorsmodificado {
    private int[] array;
    private int [] copia1;
    private int [] copia2;

    public static void main(String[] args) {
        CercaValorsmodificado programa = new CercaValorsmodificado() ;
        programa.inici();

    }

    public void inici(){
        inicioaleatorio();
        operaciones();
        mostrarposicionesyvalores();
    }

    public void inicioaleatorio() {
        Random rd = new Random();
        array = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }

        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public void operaciones(){
        copia1 = Arrays.copyOfRange(array, 0, 5);
        System.out.println("]");
        System.out.print("Valors a cercar: [ ");
        for (int i = 0; i < copia1.length; i++) {
            System.out.print(copia1[i]+" ");
        }
        copia2 = Arrays.copyOfRange(array, 5, array.length);
        System.out.println("]");

        Arrays.sort(copia2);
        System.out.print("Array on es cerca: [ ");
        for (int i = 0; i < copia2.length; i++) {
            System.out.print(copia2[i]+" ");
        }
    }
    public void mostrarposicionesyvalores() {
        System.out.println("]");
        for (int i = 0; i < copia1.length; i++) {
            boolean trobat = false;
            for (int j = 0; j < copia2.length; j++) {
                if (copia1[i] == copia2[j] && trobat == false) {
                    System.out.println("A la posicio " + Arrays.binarySearch(copia2, copia1[i]) + " hi ha el valor " + copia1[i]);
                    trobat = true;
                }

            }
        }
    }
}