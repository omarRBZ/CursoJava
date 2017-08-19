public class ArgumentosVariables{
    public void multiplicacion(int y, int... x){
          int suma =0;
          for (int i=0;i<x.length ;i++ ) {
            suma=suma+x[i]+y;

          }

        System.out.println(suma);


    }
    public static void main (String[]args){
      ArgumentosVariables obj= new ArgumentosVariables();
      obj.multiplicacion(1,12,3,3,3,3);

    }
}
