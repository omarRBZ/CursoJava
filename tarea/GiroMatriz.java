import java.util.Scanner;
public class GiroMatriz{

  public void Derecha(int [][]Matriz ){
    for (int k=0;k<Matriz.length ;k++ ) {
      for (int i=Matriz.length-1 ;i>=0 ;i-- ){
        System.out.print(Matriz[i][k]+" ");

      }
      System.out.println();

    }

  }
  public void Reverce(int [][]Matriz){
    for (int i=Matriz.length-1;i>=0 ;i-- ) {
      for (int k=Matriz.length-1;k>=0 ;k-- ) {
        System.out.print(Matriz[i][k]+" ");

      }
      System.out.println();

    }


  }
  public void Izquierda(int [][] Matriz){
    for (int k=Matriz.length-1;k>=0 ;k-- ) {
      for (int i=0;i <Matriz.length ; i++) {
        System.out.print(Matriz[i][k]+" ");

      }
      System.out.println();

    }

  }
  public  void Original(int [][] Matriz){
    for (int i=0;i<Matriz.length ;i++ ) {
      for (int j=0;j<Matriz.length ;j++) {
        System.out.print(Matriz[i][j]+" ");

      }
      System.out.println();

    }

  }
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    GiroMatriz g=new GiroMatriz();
    String letra;
    int indice=leer.nextInt();
    int Matriz[][]= new int [indice][indice];

    for (int i =0;i<Matriz.length ;i++ ) {
      for (int j=0;j<Matriz.length ;j++ ) {
        int numero= leer.nextInt();
        Matriz[i][j]=numero;

      }
    }
    int giros=leer.nextInt();
    int contador=0;
    for (int i=1;i<=giros ;i++ ) {
      letra=leer.next();
      if (letra.equals("d")) {
        contador=contador+1;
      }
      else if(letra.equals("i")){
        contador=contador+3;
      }
    }
    System.out.println(contador);
    int reciduo=contador%4;
    switch(reciduo)
 {
         case 0:
         {
             g.Original(Matriz);
             break;
         }

         case 1:
         {
             g.Derecha(Matriz);
             break;
         }
         case 2:
         {
           g.Reverce(Matriz);
           break;
         }
         case 3:
         {
           g.Izquierda(Matriz);
           break;
         }

}
}
}
