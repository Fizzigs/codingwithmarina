package UF2.registronotas;

public class registronotas {
    public static void main(String[] args) {

        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        maximo jcp = new maximo();
        double max = jcp.calcularMaxim(notes);
        minimo jcp2 = new minimo();
        double min = jcp2.calcularMinim(notes);
        mitjana jcp3 = new mitjana();
        double mitjana = jcp3.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}