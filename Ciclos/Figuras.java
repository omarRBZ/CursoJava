import java.util.Scanner;
public class Figuras{
  public static void main(String[] args) {
    String a="";
    int numero= leer.nextInt();

    for (int i=0;i<numero;i++){
      a=a+"*";
    System.out.println(a);
  }

for (int i=0;i<numero ;i++ ) {
  for (int k=numero-i;k>0 ;k-- ) {
    System.out.print(" ");


  }
  for (int k=0;k<i ;k++ ) {
   System.out.print(" *");

  }
System.out.println(" ");
}

for (int i=0;i<numero ;i++ ) {
  for (int k =numero-i;k>0 ;k-- ) {
    System.out.print("  ");

  }
  for (int k=0;k<i ;k++ ) {
    int suma= i+k;
    System.out.println(suma);

  }

}

  }



}
