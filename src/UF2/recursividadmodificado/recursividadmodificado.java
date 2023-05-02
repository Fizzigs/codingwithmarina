package UF2.recursividadmodificado;

public class recursividadmodificado{
    public static void main(String args[]) {
       npp (33);
    }
    public static int npp (int x){
        if(x >= 0){
            if(x % 2 > 0){
                System.out.println(x +"Es impar");
                return x + npp (x-1);
            }
            else{
                System.out.println(x + "Es par");
                return x + npp (x-1);
            }
        }
        else{
            System.out.println("");
        }
        return x;
    }
}