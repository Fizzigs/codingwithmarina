package UF4.HerenciaSimple;


public class Estudiant extends Persona{
    private String curs;
    private String assignaturas;
    private String escola;
    private int notes;
    public String getCurs() {
        return curs;
    }

    public String getAssignaturas() {
        return assignaturas;
    }

    public String getEscola() {
        return escola;
    }

    public int getNotes() {
        return notes;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public void setAssignaturas(String assignaturas) {
        this.assignaturas = assignaturas;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }


}
