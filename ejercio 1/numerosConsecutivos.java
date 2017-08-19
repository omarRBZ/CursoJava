import java.util.Scanner;

class numerosConsecutivos{
   public static void main(String[] args) {
     Scanner leer =new Scanner(System.in);
     int contador=1;
     int []x =new int [5];
     int numero=0;
    for (int i=0;i<x.length ;i++ ) {
      System.out.println("introduce un nunero");
      numero=leer.nextInt();
      x[i]=numero;

    }
    for (int j=0 ;j<x.length ;j++ ) {
      int temporal =x[j]+1;
      System.out.println(x[j]+"->"+temporal);
      if (x[j]+1==temporal) {
        System.out.println(true);


      }if(x[j]==temporal){

        System.out.println("false");
      }




    }



   }

}
