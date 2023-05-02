package UF2.minimomaximomediacarpeta;

import java.util.Scanner;

public class minimomaximomedia {
    private double min = 0;
    private double max = 0;
    private double mitj = 0;

    public static void main(String args[]) {
        minimomaximomedia programa = new minimomaximomedia();
        programa.inici();
    }

    public void inici() {
        mostrarmenu();
        leerdatos();
        calculamax();
        calculamin();
        calculamitj();
        imprimir();
    }

    private void imprimir() {
        System.out.println("La nota más pequeña és: " + min + '\n' + "La nota más gande: " + max + '\n' + "Y la media és: " + mitj);
    }

    public void mostrarmenu() {
        System.out.println("Indica 5 notas de 0 al 10");
    }

    public void leerdatos() {
        Scanner scanner1 = new Scanner(System.in);
        double nota = scanner1.nextDouble();
        System.out.println("estamos bien");
    }

    public static double calculamax() {
        double[] nums = new double[5];
        double max = nums[5];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static double calculamin() {
        double[] nums = new double[5];
        double min = nums[5];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }

    public static double calculamitj() {
        double sum = 0;
        double[] nums = new double[5];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;

    }
}
