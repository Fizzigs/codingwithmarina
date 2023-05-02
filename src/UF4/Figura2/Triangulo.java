package UF4.Figura2;

public class Triangulo {
    public String color;
    public int costado1;
    public int costado2;
    public int costado3;

    /**
     * @param c representa el color de las figuras
     * @param c1 representa el costado de una figura
     * @param c2 representa el segundo costado de una figura
     * @param c3 representa el tercer costado de una figura
     */
    public Triangulo(String c, int c1, int c2, int c3){
        color = c;
        costado1 = c1;
        costado2 = c2;
        costado3 = c3;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCostado1() {
        return costado1;
    }

    public void setCostado1(int costado1) {
        this.costado1 = costado1;
    }

    public int getCostado2() {
        return costado2;
    }

    public void setCostado2(int costado2) {
        this.costado2 = costado2;
    }

    public int getCostado3() {
        return costado3;
    }

    public void setCostado3(int costado3) {
        this.costado3 = costado3;
    }
}
