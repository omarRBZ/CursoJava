class Estaticos{
  static int x=200;
  public static void m1(){
    System.out.println("metodo estatico");

  }
public static void main(String[] args) {
  System.out.println(Estaticos.x);
  Estaticos.m1();
  System.out.println(x);
  m1();
  Estaticos s=null;
  System.out.println(s.x);
  s.m1();
  

  }
}
