package UF4.empresa;

public class tipusproducte {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;

    public int getCodiIdentificador() {
        return codiIdentificador;
    }

    public void setCodiIdentificador(int codiIdentificador) {
        this.codiIdentificador = codiIdentificador;
    }

    private int codiIdentificador;

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    private double preu;

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    private int estoc;

    public boolean isaLaVenda() {
        return aLaVenda;
    }

    public void setaLaVenda(boolean aLaVenda) {
        this.aLaVenda = aLaVenda;
    }

    private boolean aLaVenda;
}
