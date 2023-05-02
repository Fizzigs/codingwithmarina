package UF4.Figura;

public class Trapezi extends Figura{
    private int costat1;
    private int costat2;
    private int costat3;
    public int getCostat1() {
        return costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public int getCostat3() {
        return costat3;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }

    public void setCostat3(int costat3) {
        this.costat3 = costat3;
    }

    public Trapezi(int a, int b, int h){
        costat1 = a;
        costat2 = b;
        costat3 = h;
        setFigura("Trapezi");
        setId(4);
    }
    public double calcularArea(){
        costat3 = costat3 *((costat1 * costat2)/2);
        return costat3;
    }
}
