class B{
  private int zice;
  private String nombre;
  private String color;

  public int getZice(){
    return zice;
  }

  public void setZice(int zice){
    this.zice=zice;
  }

  public String getNombre(){
    return nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setColor(String color ){
    this.color=color;
  }
  public String getColor(){
    return color;
  }
}


class A
{
public static void main(String[] args) {
  B b     =    new B();
  b.setNombre("omar");
  b.setZice(34);
  b.setColor("azul");
  int x   =b.getZice();
  String s=b.getNombre();
  String c=b.getColor();


    System.out.println(x);
    System.out.println(s);
    System.out.println(c);

}


}
