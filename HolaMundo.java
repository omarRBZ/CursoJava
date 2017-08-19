import java.util.Date;
public class HolaMundo{
 public static void main(String[] args) {
   Calendar fecha = Calendar.getInstance();
        int ano = fecha.get(Calendar.YEAR);
   int edad = 22;
   int mayor= 18;
   int yearBorn=1992;
   System.out.println("introduce tu ano de nacimiento");
   if (edad>=mayor) {
     System.out.println("eres mayor de edad");

   }else if ((yearBorn-ano)>=mayor) {
     System.out.println("usted es mayor de edad");

   }

  }


}
