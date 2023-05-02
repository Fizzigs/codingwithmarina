package UF4.Figura2;

public class Circulo {
    public String color;
    public double radio;

    /**
     * @param c representa el color de las figuras
     * @param r representa el radio del circulo
     */
    public Circulo(String c, double r){
        color = c;
        radio = r;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
