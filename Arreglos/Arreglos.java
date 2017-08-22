import java.util.Scanner;
public class Arreglos{

  public static void main(String []args){
    Scanner leer = new Scanner(System.in);
    int indice1 =leer.nextInt();
    int indice2 = leer .nextInt();
    int [][] arreglo= new int[indice1] [indice2];
    for (int i=0 ; i<arreglo.length  ;i++ ){
      for (int k=0;k<arreglo[i].length ;k++) {
        int numero=leer.nextInt();
        arreglo[i][k]=numero;
      }
    }
    System.out.println();
    for (int i=arreglo.length-1;i>=0 ;i-- ) {
      for (int k=0;k<arreglo[i].length ;k++ ) {
        System.out.print(arreglo[i][k]+" ");

      }
      System.out.println();

    }

  System.out.println("");
    for (int i=0;i<arreglo.length ;i++ ) {
      for (int k=arreglo[i].length-1;k>=0 ;k-- ) {
          System.out.print(arreglo[i][k]+" ");
      }
      System.out.println();
    }

    }
  }
