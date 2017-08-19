/*
crear una clase abstracta Figura con 2 metodos abstractos
*calcularArea()
*calcularPerimetro()
y dos clases concretas cuadrado y circulo
que ereden de ella e implementen sus metodos ,
NOTA cada clase deberan agregarse los atributos nesesarios para el calculo
area y el perimetro
*/

abstract class Figura{

  abstract void calcularArea(double dato);
  abstract void calcularPerimetro(double dato);

}

class Cuadrado extends Figura{
  double dato;
  public void calcularArea(double dato){

    this.dato=dato;
    double area=dato*dato;
    System.out.println("tu area es :"+area);

  }
  public void calcularPerimetro(double dato){
    this.dato=dato;
    double perimetro= dato*4;
    System.out.println("tu perimetro es :"+perimetro);


  }


}
class Circulo extends Figura{
  double radio;

  public void calcularPerimetro(double radio){
    this.radio=radio;
    double perimetro= radio*2*3.1416;
    System.out.println("tu perimetro del circulo es :"+perimetro);

  }
  public void calcularArea(double radio){
    this.radio=radio;
    double area = 3.1416*radio*radio;
    System.out.println("tu area es :"+area);

  }


}

public class TestFigura{
public static void main(String []args){
  Figura c= new Circulo();
  Figura cu= new Cuadrado();
  c.calcularPerimetro(12);
  c.calcularArea(12);
  cu.calcularArea(7);
  cu.calcularPerimetro(7);
}



}
