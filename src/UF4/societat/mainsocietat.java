package UF4.societat;

import UF4.Persona.Persona;

public class mainsocietat {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setDni("46478386D");
        p1.setNom("Atrio");
        p1.setEdat(20);
        p1.visualitzar();

        Persona p2 = new Persona ("46478386F", "Joan", 20);
        p2.visualitzar();

        Persona p3 = new Persona ("46478386G", "Pozo");
        p3.setEdat(45);
        p3.visualitzar();

        Persona p4 = new Persona ("46478386H");
        p4.setEdat(46);
        p4.setNom("Nacho");
        p4.visualitzar();

        Persona p5 = new Persona (21);
        p5.setNom("Juan");
        p5.setDni("46478386J");
        p5.visualitzar();

        Persona p6 = new Persona ("46478386K", 22);
        p6.setNom("Ignacio");
        p6.visualitzar();
        
        Persona p7 = new Persona (23,"Nacho");
        p7.setEdat(47);
        p7.visualitzar();
    }
}
