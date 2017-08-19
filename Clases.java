
public class Clases extends metodos{
    public void carro(){
    System.out.println("BMW");
  }
  public static void main (String []args) {
    Clases objeto= new Clases();
    objeto.carro();

    metodos obj =new metodos();
    obj.area(5,4);

  }
}

final class metodos
{
  final int  numero=2;


  public void area(int x , int j){
    numero=x;
    System.out.println(x*j);


  }
  final void carro(){
    System.out.println("no se");
      System.out.println("no se encontro");
  }
}
