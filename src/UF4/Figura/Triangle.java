package UF4.Figura;

public class Triangle extends Figura{
    private int base;
    private int h;
    public int getBase() {
        return base;
    }

    public int getH() {
        return h;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Triangle(int b, int a){
        base = b;
        h = a;
        setFigura("Triangle");
        setId(1);
    }
    public double calcularArea(){
        h = (base*h)/2;
        return h;
    }
}
