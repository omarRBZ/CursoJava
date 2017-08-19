package p1;
import paquete2.Clase2;

public  class Ejercisio4 extends Clase2{
  public void cuadrado(){
    System.out.println("circulo");

  }
  public void circulo(){
    System.out.println("circulo");
  }
  public void triangulo(){
    System.out.println("triangulo");
  }
 public static void main(String[] args) {
   Ejercisio4 ej=new Ejercisio4();
   ej.cuadrado();


  }
}

class Clase3 extends Clase2{

      void cuadrado(){
        System.out.println("circulo");
      }
       void circulo(){
        System.out.println("circulo");
      }
       void triangulo(){
        System.out.println("triangulo");
      }
}
