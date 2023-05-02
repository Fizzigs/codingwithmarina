package UF2.entrada;

public class escriureestrelles {
    public static void main (String[] args) {
        escriureestrelles programa = new escriureestrelles();
        programa.inici();
    }
    public void inici (){

        estrellas(4);
        estrellas(10);
        estrellas(20);
        estrellas(10);
        estrellas(20);
        estrellas(10);
        estrellas(20);
        estrellas(10);
        estrellas(20);
        estrellas(10);
        estrellas(20);
    }
    public void estrellas(int a){
        for (int x = 0;a > x; x++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
