import java.util.Scanner;
public class capicula{
  public static void main(String[]args){
    int k=0;
    Scanner leer = new Scanner(System.in);
    int N=0;
    int numero=0;
     N=leer.nextInt();
    int []numeros=new int [N];
     for (int i=0;i<numeros.length ;i++ ) {
        numero=leer.nextInt();
       numeros[i]=numero;
    }

      for (int j=numeros.length-1;j>=0 ;j-- ) {
        if (numeros[j]==numeros[k]) {
          k++;

          if (k==numeros.length){
          System.out.println("SI");

        }else {
          System.out.println("NO");
        }

        }


      }

  }
}
