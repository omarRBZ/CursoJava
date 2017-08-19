public class VarArgs{
public static int  Suma (int... datos){
  int suma=0;
  for (int i=0;i<datos.length ;i++ ) {
    suma=suma+datos[i];

  }
  return suma;
}
  public static void main (String []args){
    System.out.println(Suma());
    System.out.println(Suma(1,2,3,4));
    System.out.println(Suma(23));
    System.out.println(Suma(89,1));
  }
}
