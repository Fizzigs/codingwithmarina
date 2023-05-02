package UF4.Figura;

public class Figura{
    public String figura;

    public static int id;

    public String getFigura() {
        return figura;
    }

    public int getId() {
        return id;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    public static void setId(int id) {
        Figura.id = id;
    }

    public void imprimirDades(){
        System.out.println("La figura con id" + " " + getId() + " " + getFigura());
        System.out.println("El area de" + " " + getFigura() + " " + "és" + " " + calcularArea());
        System.out.println("----------------------------------------------------");
    }
    public double calcularArea(){
        return 0;
    }
}
