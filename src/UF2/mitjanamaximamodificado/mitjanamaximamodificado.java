package UF2.mitjanamaximamodificado;
public class mitjanamaximamodificado {

        public static void main(String[] args) {
            mitjanamaximamodificado programa = new mitjanamaximamodificado();
            programa.inici();
        }
        public void inici(){


            mitjanamaximaoperaciones calc = new mitjanamaximaoperaciones();
            System.out.println("rellenar 1r vector: ");
            double[] arrayA = new double [6];
            arrayA = calc.leerArray(arrayA);
            System.out.println("rellenar 2nd vector: ");
            double[] arrayB= new double[6];
            arrayB = calc.leerArray(arrayB);

            double mitjanaA = calc.calcularmitjana(arrayA);
            double mitjanaB = calc.calcularmitjana(arrayB);

            if (mitjanaA > mitjanaB) {
                System.out.println("arrayA té una mitjana més alta.");
            }
            else if (mitjanaA < mitjanaB) {
                System.out.println("arrayB té una mitjana més alta.");
            }
            else {
                System.out.println("Les dues mitjanes són iguals!");
            }
        }
}
