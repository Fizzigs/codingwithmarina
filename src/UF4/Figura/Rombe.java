package UF4.Figura;

public class Rombe extends Figura{
    private int dM;
    private int dm;
    public int getdM() {
        return dM;
    }

    public int getDm() {
        return dm;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public Rombe(int dM, int dm){
        this.dM = dM;
        this.dm=dm;
        setFigura("Rombe");
        setId(5);
    }
    public double calcularArea(){
        this.dM = (this.dM * this.dm/2);
        return this.dM;

    }
}
