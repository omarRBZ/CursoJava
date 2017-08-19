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
  public static calcula getCalcula(Empleado e){
    if (e instanceof Empleado) {
      return new CalculaJefe();

      }

    if (e instanceof Empleado){
      return new CalculaSub();
    }
    return null;

  }

   public static void main(String[] args) {
     Empleado e= new Jefe();
     e.setNombre("omar");
     e.setApellido("rojas");
     e.setSalario(16000);
     calcula c ;
     c=getCalcula(e);
     System.out.println(e.getNombre());
     System.out.println(e.getApellido());
     System.out.println(e.getSalario());

     System.out.println(c.calcularImpuesto(g.getSalario()));
     System.out.println(c.calcularComicion(e.getSalario()));


      e= new Subordinado;
      e.setNombre("achi");
      e.setApellido("zapotitla");
      e.setSalario(16000);
      calcula c ;
      c=getCalcula(e);
      System.out.println(e.getNombre());
      System.out.println(e.getApellido());
      System.out.println(e.getSalario());

      System.out.println(c.calcularImpuesto(g.getSalario()));
      System.out.println(c.calcularComicion(e.getSalario()));






  }




}
