
class operaciones{
/////////////****SUMA /////////////////////////////////
public void operaciones (int x, String operador, int y){
  if (operador.equals("sum")|| operador.equals("+")){
    int suma=x+y;
    System.out.println(suma);

  }
  if (operador.equals("res")|| operador.equals("-")) {
    int  resta=x-y;
    System.out.println(resta);

  }
  if (operador.equals("div")|| operador.equals("/")) {
    int  divicion=x-y;
    System.out.println(divicion);

  }
  if (operador.equals("mul")|| operador.equals("*")) {
    int  multiplicacion=x*y;
    System.out.println(multiplicacion);

  }
}
public void operaciones (double x,String operador, int y){
  if (operador.equals("sum")|| operador.equals("+")){
    double suma=x+y;
    System.out.println(suma);

  }
  if (operador.equals("res")|| operador.equals("-")) {
    double resta=x-y;
    System.out.println(resta);

  }
  if (operador.equals("div")|| operador.equals("/")) {
    double divicion=x-y;
    System.out.println(divicion);

  }
  if (operador.equals("mul")|| operador.equals("*")) {
    double multiplicacion=x*y;
    System.out.println(multiplicacion);

  }
}
public void operaciones (int x, String operador, double y){
  if (operador.equals("sum")|| operador.equals("+")){
    double suma=x+y;
    System.out.println(suma);

  }
  if (operador.equals("res")|| operador.equals("-")) {
    double resta=x-y;
    System.out.println(resta);

  }
  if (operador.equals("div")|| operador.equals("/")) {
    double divicion=x-y;
    System.out.println(divicion);

  }
  if (operador.equals("mul")|| operador.equals("*")) {
    double multiplicacion=x*y;
    System.out.println(multiplicacion);

  }
}
public void operaciones (double x, String operador, double y){
    if (operador.equals("sum")|| operador.equals("+")){
      double suma=x+y;
      System.out.println(suma);

    }
    if (operador.equals("res")|| operador.equals("-")) {
      double resta=x-y;
      System.out.println(resta);

    }
    if (operador.equals("div")|| operador.equals("/")) {
      double divicion=x-y;
      System.out.println(divicion);

    }
    if (operador.equals("mul")|| operador.equals("*")) {
      double multiplicacion=x*y;
      System.out.println(multiplicacion);

    }

}

}

public class Sobrecarga{
  public static void main (String[]args){



    operaciones obj=new operaciones();
    obj.operaciones(10,"+",10);
    obj.operaciones(98.0,"-",99.9);
    obj.operaciones(98,"sum",2);
    obj.operaciones(99,"mul",4.89);

  }
}
