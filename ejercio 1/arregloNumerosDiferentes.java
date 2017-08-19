import java.util.Scanner;

class arregloNumerosDiferentes{
   public static void main (String []args){
     Scanner leer = new Scanner (System.in);
     int temporal=0;
     int n=0;
     int [] x =new int [5];
     for (int i=0;i<x.length ;i++) {
       System.out.println("introduce un numero");
       n=leer.nextInt();
       x[i]=n;

     }

     for (int j=0;j<x.length ;j++ ) {
       for (int k=0;k<x.length;k++ ) {
         if (x[j]==x[k]) {
           System.out.println("true");
           temporal++;

         }
         if (temporal>5){
           System.out.println(false);
         }

       }





     }


   }

}
