import java.util.Scanner;

public class Dolares{
  public static void main(String[]args){
    Scanner leer = new Scanner(System.in);

    int N=leer.nextInt();
    int K= leer.nextInt();
    if (N<=10000 && K<=100) {
      int cambio= N*K;
      System.out.println(cambio);

    }

  }
}
