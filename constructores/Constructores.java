class padre{

  public padre (){
    System.out.println("padre");
  }
}

class hijo extends padre{
  public hijo(String m ){
    super();
    System.out.println("hijo"+m);
  }
}


class nieto extends hijo{
  {
    System.out.println("BLOQUE DE INICIALIZACION DE INSTANCIA 1");
  }
  public nieto(){
    this("soy tu padre ");
    System.out.println("construtor sin argumentos");
  }
  {
      System.out.println("BLOQUE DE INICIALIZACION DE INSTANCIA 2");
  }
  public nieto(String s ){
    super(s);
    System.out.println("constructor con argumentos ");
      System.out.println("FIN DEL CONSTRUCTOR ");
  }
  {
      System.out.println("BLOQUE DE INICIALIZACION DE INSTANCIA 3");
  }
}


class TestConstructor{
  static {
    System.out.println("BLOQUE DE INICIALIZACION ");
  }

  public static void main (String [] args){
    System.out.println("INICIO DEL MAIN ");
    nieto n= new nieto("mensaje");

  }
}
