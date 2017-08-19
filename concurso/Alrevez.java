import java.util.Scanner;

 public class Alrevez{
   public static void main (String []args){
     Scanner leer = new Scanner(System.in);
     String cadena ;
      String alreves="";
      char l ;

     cadena =leer.nextLine();
     for (int i = cadena.length()-1; i>=0 ;i-- ) {
       l=cadena.charAt(i);

       alreves=alreves+l;


     }
     System.out.println(alreves);




   }
 }
