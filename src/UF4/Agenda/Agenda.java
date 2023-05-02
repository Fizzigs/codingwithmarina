package UF4.Agenda;
public class Agenda {
    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
    private int any;
    public Agenda(){}

    /**
     * @param a indico que any es igual a a
     */
    public Agenda(int a){
        any = a;
    }
    public void avançarPagina(){

    }
    public void retrocedirPagina(){

    }

    /**
     * @return indico que pagina es igual a p y hago un parametro de salida con la misma p
     */
    public Pagina llegirPagina(){
        Pagina p = new Pagina();
        return p;
    }
}
