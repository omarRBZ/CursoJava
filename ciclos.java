public class ciclos{
  static void int incrementar(int i){
    return i++;
  }
  public static void main(String[] args) {
    for (int k;k<10 ;System.out.println("llamado al metodo incrementar" ),k=incrementar(k)) {

    }
  }
}

clas ForEch{
  public static void main(String[] args) {
    ArrayList<object> a= new ArrayList<object>();
    int []arr=new int [3];
    int [][]arr2=new int [3][4];
    for (int [] v:arr2 ) {
      for (int e:arr ) {
        System.out.print(e);

      }
      System.out.println(e);


    }
    // como el ArrayList contine objetos se debe declarar una variable que almacene referencias del los objetos en este caso
    // con un arreglo de objetos;

    for (object[]o:a) {
      for (object o:a ) {


      }

    }
    forDEaFUREA:
    for (int =0 ;i<3 ;i++ ) {
      forDeAdentro:
      for (int k=1;k<10 ;k++ ) {
        if (k%2==0 && i==1) {
          contine forDEaFUREA;

        }
        System.out.println(k);
        if (k==6 && i==1) {
          break forDeAdentro;

        }

      }

    }

  }

}
