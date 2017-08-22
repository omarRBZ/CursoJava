import java.util.Scanner;
public class Anagrama2{
  public static void main(String[] args) {

    Scanner  leer = new Scanner(System.in);
    String palabra1=leer.nextLine();
    String palabra2=leer.nextLine();
    int contador=0;
    int letras[]=new int[27];
    if (palabra1.length()==palabra2.length()){
      for (int i=0;i<=palabra1.length()-1 ;i++ ) {
        char c1=palabra1.charAt(i);
        char c2=palabra2.charAt(i);
        letras[c1-'a']++;
        letras[c2-'a']--;

      }
    }
    for (int i=0;i<letras.length ;i++ ) {
      if (letras[i]!=0) {
        System.out.println("No es anagrama");
        break;
      }
      else{
      contador++;
      }

    }
    if (contador==letras.length) {
      System.out.println("es anagrama");

    }


  }

}
