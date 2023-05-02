package UF2.PrediccioPersona;

import java.util.Scanner;

public class PrediccioPersona {
    private String mesNaixament="";
    private double numSort = 0;
    private String equipFutbol = "";
    private String llenguatgeProgramacio = "";
    private String mostrarMenu = "";
    private double edad = 0;
    private String nom = "";

    private Scanner s = new Scanner (System.in);
    public static void main (String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
        }

        public void inici() {
        mostrarMenu();
        datos();
        mes();
        imprimir();
        }

    private void datos() {
        Scanner s = new Scanner(System.in);

        //recollim la dada a la variable mesNaixement
        mesNaixament = s.nextLine();

        //demanem a l'usuari el mes en què va nèixer
        System.out.print("\n");
        System.out.print("Com et dius?\n");

        //recollim la dada a la variable nom
        nom = s.nextLine();

        //demanem a l'usuari la seva edat
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        //recollim la dada a la variable edat
        edad = s.nextInt();

        System.out.print("\n\n");
    }

    private void edad(){
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        System.out.print("\n\n");
        double edad = s.nextDouble();
    }
    public void mostrarMenu() {
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Enero\tFebrero\tMarzo\n");
        System.out.print("Abril\tMayo\tJunio\n");
        System.out.print("Julio\tAgosto\tSeptiembre\n");
        System.out.print("Octubre\tNoviembre\tDiciembre");
        System.out.print("\n\n");

    }
    public void mes() {

        if (mesNaixament.equalsIgnoreCase("enero")) {
            enero();
        }
        else if (mesNaixament.equalsIgnoreCase("febrero")) {
            febrero();
        }
        else if(mesNaixament.equalsIgnoreCase("marzo")){
            marzo();
        }
        else if(mesNaixament.equalsIgnoreCase("abril")){
            abril();
        }
        else if (mesNaixament.equalsIgnoreCase("mayo")) {
            mayo();
        }
        else if (mesNaixament.equalsIgnoreCase("junio")) {
            junio();
        }
        else if (mesNaixament.equalsIgnoreCase("Julio")) {
            julio();
        }
        else if (mesNaixament.equalsIgnoreCase("agosto")) {
            agosto();
        }
        else if (mesNaixament.equalsIgnoreCase("septiembre")) {
            septiembre();
        }
        else if (mesNaixament.equalsIgnoreCase("octubre")) {
            octubre();
        }
        else if (mesNaixament.equalsIgnoreCase("noviembre")) {
            noviembre();
        }
        else if (mesNaixament.equalsIgnoreCase("diciembre")) {
            diciembre();
        } else {
            numSort = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }

    }
    public void enero(){
        numSort = edad * 3 / 2;
        equipFutbol = "Bayern de Munich";
        llenguatgeProgramacio = "C++";
    }
    public void febrero(){
        numSort = edad - 4;
        equipFutbol = "Atlético de Madrid";
        llenguatgeProgramacio = "Python";
    }
    public void marzo(){
        numSort = edad / 2;
        equipFutbol = "Chelsea";
        llenguatgeProgramacio = "JavaScript";
    }
    public void abril(){
        numSort = edad % 4;
        equipFutbol = "Manchester city";
        llenguatgeProgramacio = "Node.js";
    }
    public void mayo(){
        numSort = edad * 3 / 6;
        equipFutbol = "Liverpool";
        llenguatgeProgramacio = "React";
    }
    public void junio(){
        numSort = edad + edad;
        equipFutbol = "Real Madrid";
        llenguatgeProgramacio = "C#";
    }
    public void julio(){
        numSort = edad * edad / 5;
        equipFutbol = "BVB";
        llenguatgeProgramacio = "Swift";
    }
    public void agosto(){
        numSort = edad * 1 / 2 * edad;
        equipFutbol = "FCB";
        llenguatgeProgramacio = "Java";
    }
    public void septiembre(){
        numSort = edad / edad;
        equipFutbol = "Juve";
        llenguatgeProgramacio = "PHP";
    }
    public void octubre(){
        numSort = edad * 4 / 3;
        equipFutbol = "PSG";
        llenguatgeProgramacio = "R";
    }
    public void noviembre(){
        numSort = edad % 2 + 23;
        equipFutbol = "Sevilla CF";
        llenguatgeProgramacio = "Go";
    }
    public void diciembre(){
        numSort = (edad + edad) / 2;
        equipFutbol = "Manchester United";
        llenguatgeProgramacio = "Ruby";
    }

    private void imprimir() {


        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");
    }
}
