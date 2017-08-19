
class clase1{
int var =10;
void m1(){
  System.out.println("metodo 1 de la clase 1");
}

}

abstract class clase2{
  int v=100;
  void m1(){
    System.out.println("metodo 1 de la clase 2");

  }
  abstract void m2();


}

class clase3{
  public static void main (String []args){
    clase1 c1=new clase1();
    //clase2 c2=new clase2();


  }
}
interface Saludo{
  void saludo1();
  void saludo2();
  void saludo3();


}
public class abstracta implements Saludo{
  public static void main(String[] args) {
    abstracta obj=new abstracta();
    obj.saludo1();

 }

public void saludo1(){
  System.out.println("hola");

}
public void saludo2(){
  System.out.println("hello");
}
  public void saludo3(){
    System.out.println("bonacera");
  }

}

class principal{
   public static void main(String[] args) {
     abstracta obj=new abstracta();
     obj.saludo1();

  }
}
