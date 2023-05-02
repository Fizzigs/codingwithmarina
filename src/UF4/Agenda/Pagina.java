package UF4.Agenda;

public class Pagina {
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    private int dia;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    private int mes;
    public Pagina(){}

    /**
     * @param a indico que dia es equivalente a la a
     * @param b indico que mes es equivalente a la b
     */
    private void Pagina(int a, int b){
        dia = a;
        mes = b;
    }
    public void afegirCita(Cita c){

    }
    public void borrarCita(Cita c){

    }

    /**
     * @param titulo he creado un parametro de entrada que es un string
     * @return he creado un parametro de salida que indica que cita es igual a c y lo devuelve
     */
    public Cita cercarCita(String titulo){
        Cita c = new Cita();
        return c;

    }
    public Cita[] llistarCites(){
        Cita[] cv = new Cita[10];
        return cv;
    }

}
