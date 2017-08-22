import java .util.Scanner;
public class Carretera{
  public static void main (String []args){
    Scanner leer = new Scanner(System.in);
    int x= leer.nextInt();
    int y= leer.nextInt();
    int contador=0;
    int segmentos =0;
    int [][] Carretera= new int [x][y];

    for (int i=0; i< Carretera.length ; i++ ) {
      for (int j=0; j<Carretera.length; j++ ) {
        int numero= leer.nextInt();
        Carretera[i][j]=numero;

      }


    }
    System.out.println();
    for (int i=0;i<Carretera.length ;i++ ) {
      for (int j=0; j<Carretera.length;j++  ) {
        System.out.print(Carretera[i][j]+" ");
      }
      System.out.println();


    }

  }
}
