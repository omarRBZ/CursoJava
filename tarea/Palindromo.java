import java.util.Scanner;
public class Palindromo{
  public static void main (String []args){
    Scanner leer = new Scanner(System.in);
    String caracteres="~!@#$%^&*()_+-=-[]{}|;/.,<>?:1234567890";
    String  cadena=leer.nextLine();
    cadena=cadena.toLowerCase();
    char[] aCaracteres = cadena.toCharArray();
    String nuevaCadena="";
    String alreves="";
    for (int i=0;i<=caracteres.length()-1 ;i++ ) {
      for (int j=0; j<=cadena.length()-1 ; j++ ) {
        if (caracteres.charAt(i)==cadena.charAt(j)) {
        aCaracteres[j]=' ';
        }
      }
  }
  
nuevaCadena=nuevaCadena.replace(" ", "");
for (int i = nuevaCadena.length()-1; i>=0 ;i-- ) {
  char l=nuevaCadena.charAt(i);
  alreves=alreves+l;
}
  if (nuevaCadena.equals(alreves)) {
    System.out.println("es un Palindromo");

  }
  String palabra=limpia(cadena);
  StringBuilder reverse = new StringBuilder(cadena);
  reverse.reverse();
  if (palabra.equals(reverse.toString())) {
    System.out.println("si es un Palindromo");
  }
  else{
    System.out.println("no es un Palindromo");
  }
}
public static String limpia(String p){
  StringBuilder sb = new StringBuilder();
  for (int i=0;i<p.length() ;i++ ) {
    char c=p.charAt(i);
    if (c>='a' && c<='z') {
      sb.append(c);

    }

  }
  System.out.println(sb);
  return sb.toString();
}



}
