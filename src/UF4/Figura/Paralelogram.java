package UF4.Figura;

public class Paralelogram extends Figura{
    private int b;
    private int h;
    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }
    public Paralelogram(int b, int h){
        this.b = b;
        this.h = h;
        setFigura("Paralelogram");
        setId(6);
    }
    public double calcularArea(){
        this.b = this.b * this.h;
        return this.b;
    }
}
