import java.util.Scanner;
class divisores{
  public static void main (String []args){
    Scanner leer = new Scanner(System.in);
    int divisor=0;
    int contador=0;
    int numero;
    int divicion=0;
    System.out.println("introduce un numero");
    numero=leer.nextInt();


for (int i=0;i<=numero ;i++ ) {
      numero=numero/2;
  if (numero>=1) {
    contador++;

  }

}





    System.out.println(divicion);
    System.out.println(contador);







}


}
