package UF4.Figura2;

public class Cuadrado {
    public String color;
    public int costado;

    /**
     * @param c representa el color de las figuras
     * @param cost representa el costado de una figura
     */
    public Cuadrado(String c, int cost){
        color = c;
        costado = cost;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCostado() {
        return costado;
    }

    public void setCostado(int costado) {
        this.costado = costado;
    }
}
