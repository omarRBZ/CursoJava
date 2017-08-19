import java.util.Scanner;

public class Tablas{
  public static void main (String[]args){
    Scanner leer = new Scanner(System.in);
    int tabla=leer.nextInt();
    int numero=0;
      int [] tablas= new int [tabla];
      for (int i=0 ;i<tablas.length ;i++ ) {
        numero=leer.nextInt();
        tablas[i]=numero;


      }
      if (numero>0){
      for (int j=1;j<tablas.length ;j++ ) {

        for (int k=1;k <=10 ;k++ ) {
          int a =tablas[j]*k;
        System.out.println(tablas[j]+"X"+k+"="+a);
        if (k==10){
          System.out.println();
        }

        }



      }


}


  }
}
