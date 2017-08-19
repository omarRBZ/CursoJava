abstract class metod {
  abstract void triangulos();
  abstract void cuadrado();

}

public class Abstracto extends metod{


    public void triangulos(){
      System.out.println("isoceles"+"equilatero"+"escaleno");
    }
    public void cuadrado(){
      System.out.println("4 lados ");
    }

  public static void main(String []args){
    Abstracto obj= new Abstracto();
    obj.triangulos();
    obj.cuadrado();


  }


}
