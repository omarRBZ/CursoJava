import java.util.Scanner;
public class NivelOptimo{
   public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int posicion1=leer.nextInt();
     int posicion2=leer.nextInt();


     if (posicion1<posicion2) {
       int resta=posicion2-posicion1;
       System.out.println(1+" "+resta);

     }
     if (posicion2<posicion1) {
       int resta=posicion1-posicion2;
       System.out.println(2+" "+resta);

     }
     if (posicion2==posicion1) {
       System.out.println("Nivel optimo");

     }

  }
}
