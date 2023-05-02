package UF4.Figura;

public class Figuramain {

    public static void main(String[] args) {
        Triangle tri = new Triangle(20, 10);
        tri.imprimirDades();

        Quadrat q = new Quadrat(40);
        q.imprimirDades();

        //Rectangle rec = new Rectangle(5, 45);
        Rectangle rec = new Rectangle();
        rec.setCostat1(5);
        rec.setCostat2(45);
        rec.imprimirDades();

        Trapezi tra = new Trapezi(10, 30, 35);
        tra.imprimirDades();

        Rombe rom = new Rombe(20,40);
        rom.imprimirDades();

        Paralelogram p = new Paralelogram(40,50);
        p.imprimirDades();

        Cercle c = new Cercle(4);
        c.imprimirDades();
    }
}
