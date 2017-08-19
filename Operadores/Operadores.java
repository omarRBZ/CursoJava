public class Operadores {
  public String toString(){
 return "objeto de la clase Prueba";
}
 public static void main(String[] args) {
   String valor1="valor : ";
  Operadores p = new Operadores();
  System.out.println(valor1+p);

  }
}

class incrementos{
  public static void main (String[]args){
    int x=100;
    int y=100;

    System.out.println(x++);
    System.out.println(y--);
    System.out.println(x);
    System.out.println(y);
    System.out.println(++x+"incremen prefijo");
    System.out.println(++x+"incremen prefijo");

  }
}

class operadorTerciario{
  public static void main (String []args){
    int edad = 21 ;
    String status=(edad>=18)?"puedes entrar al bar ":"no puedes entrar putito";
    int x=-10;
    int abs=(x<0)?x*-1:x;
    System.out.println(abs);
    System.out.println(status);
  }


}
