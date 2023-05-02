package UF4.Figura2;


public class Rectangulo {
   public int base;
   public int altura;
   public String color;

   /**
    * @param c representa la función del color
    * @param b representa la base de una figura
    * @param a representa la altura de una figura
    */
      public Rectangulo(String c, int b, int a){
      color = c;
      base = b;
      altura = a;
      }

   public int getBase() {
      return base;
   }

   public void setBase(int base) {
      this.base = base;
   }

   public int getAltura() {
      return altura;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
}
