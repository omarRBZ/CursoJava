import java .util.Scanner;
public class Carretera{
  public static void main (String []args){
    Scanner leer = new Scanner(System.in);
    int x= leer.nextInt();
    int y= leer.nextInt();
    int contador=0;
    int segmentos =0;
    int [][] Carretera= new int [x][y];
    int []tiras=new int [x+1];

    for (int i=0; i< Carretera.length ; i++ ) {
      for (int j=0; j<Carretera.length; j++ ) {
        int numero= leer.nextInt();
        Carretera[i][j]=numero;

      }
    }

    for (int k=0;k<y ;k++ ) {
      for (int i=0;i<x ;i++ ) {
        if (Carretera[i][k]==0){
          contador++;
          if (i == x-1 || Carretera[i+1][k]==1) {
            tiras[contador]++;
            contador=0;

          }
        }


      }

    }
    for (int i=0 ;i<tiras.length ;i++ ) {
      if (tiras[i]!=0){
        System.out.println(i+" "+tiras[i]);
      }

    }


  }
}
