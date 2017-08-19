interface datos {
  String nombre="omar";
  void nombre( String nombre);
  void edad();


}

abstract class Datos2{
  String especialidad="ingenieria en sistemas computacionales";

  public void especialidad(String espacialidad){
    especialidad =especialidad;
  }
  abstract void curso();



}

public class Ejercisio1 extends Datos2 implements datos{

  public void nombre(String nombre){//abstracto no se puede instanciar se hereda para despues implementarse
    System.out.println(nombre);
  }

  public void edad(){
    int edad=25;
    System.out.println(edad);
  }

  public void curso(){
    String Curso= "javaSE";
    System.out.println(Curso);

  }


  public static void main (String []args){
Ejercisio1 obj=new Ejercisio1();
obj.nombre("omar");
obj.edad();
obj.curso();
obj.especialidad("ingenieria en sistemas computacionales");
System.out.println(obj.nombre);
System.out.println(obj.especialidad);


  }







}
