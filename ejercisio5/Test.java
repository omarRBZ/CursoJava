interface calcula{
  double calcularImpuesto(double s);
  double calcularComicion(double s);

}

class CalculaJefe implements calcula  {
public  double calcularImpuesto(double s){
  return s*0.14;
}
public double calcularComicion(double s){
  return s*0.05;
}


}
class CalculaSub implements calcula{

  public  double calcularImpuesto(double s){
    return s*0.12;
  }
  public double calcularComicion(double s){
    return s*0.03;
  }

}


abstract class Empleado{
  private String nombre;
  private String apellio;
  private double salario;

  public String getNombre(){
    return nombre;
  }
  public String getApellido(){
    return apellio;
  }
  public double getSalario(){
    return salario;

  }
  public void setNombre(String nombre){
    this.nombre =nombre ;
  }
  public void setApellido(String apellio){
    this.apellio=apellio;
  }
  public void setSalario (double salario){
    this.salario=salario;
  }
}



class Jefe extends Empleado{


}
class Subordinado extends Empleado{


}


class Test2 {

  public static void getEmpleado(Empleado e){


    if(e instanceof Jefe ){
      ((Jefe)e).setNombre("omar");
      ((Jefe)e).setApellido("Rojas");
      ((Jefe)e).setSalario(19000);
      System.out.println(((Jefe)e).getNombre());
      System.out.println(((Jefe)e).getApellido());
      System.out.println(((Jefe)e).getSalario());
      CalculaJefe obj= new CalculaJefe();

      System.out.println(obj.calcularImpuesto(((Jefe)e).getSalario()));
      System.out.println(obj.calcularComicion(((Jefe)e).getSalario()));


    }
    if (e instanceof Subordinado) {
      ((Subordinado)e).setNombre("jorje");
      ((Subordinado)e).setApellido("achi");
      ((Subordinado)e).setSalario(19000);
      CalculaSub obj= new CalculaSub();
      System.out.println(((Subordinado)e).getNombre());
      System.out.println(((Subordinado)e).getApellido());
      System.out.println(((Subordinado)e).getSalario());
      System.out.println(obj.calcularImpuesto(((Subordinado)e).getSalario()));
      System.out.println(obj.calcularComicion(((Subordinado)e).getSalario()));




    }
  }

  public static void main (String[]args){
    Empleado e = new Jefe();
    getEmpleado(e);
    Empleado e2= new Subordinado();
  getEmpleado(e2);

  }

}
