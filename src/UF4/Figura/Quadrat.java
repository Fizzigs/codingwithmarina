package UF4.Figura;

public class Quadrat extends Figura{
    private int costat;
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }
    public Quadrat(int r){
        costat = r;
        setFigura("Cuadrado");
        setId(2);
    }
    public double calcularArea(){
        costat = costat * 4;
        return costat;
    }
}
