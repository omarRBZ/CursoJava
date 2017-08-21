import java.util.Scanner;
public class Desorden{
  public static void main (String []args){

    Scanner leer = new Scanner (System.in);
    int N=leer.nextInt();
    int K=leer.nextInt();
      System.out.println();
    int[][] matriz=new int [N][K];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              int numero=leer.nextInt();
                matriz[i][j]=numero;
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              int numero1=leer.nextInt();

            if(matriz[i][j]!=numero1){
              System.out.println(numero1);

            }

            }

        }
  }
}
