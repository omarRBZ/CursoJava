import java.util.Scanner;

public class Lapices {

  public static void main(String []args){

    Scanner leer = new Scanner(System.in);

    int N=leer.nextInt();
    int K=leer.nextInt();
    int contador=0;

    for (int i=0;i<N ;i++ ) {
      int y=leer.nextInt();
      if (y==K){

        contador++;
      }

    }
    System.out.println(contador);


}
}
