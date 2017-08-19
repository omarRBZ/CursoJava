import java.util.Scanner;

class bisisesto{
 public static void main(String[] args) {
   Scanner leer =new Scanner (System.in);
    int year;
    System.out.println("introduce un ano");
    year=leer.nextInt();

    if (year%4==0 && year%100==0 && year%400==0) {
      System.out.println("es bisisesto");

    }
    else{
      System.out.println("no es bisisesto");
    }



  }

}
