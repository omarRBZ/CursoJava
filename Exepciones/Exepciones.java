public class Exepciones{
  public static void m3 (){
    ArrayIndexOutOfBoundsExeption variable=new  ArrayIndexOutOfBoundsExeption("ecepcion fake ");
    throw variable;
  }
  public static void m2(){
    m3();
    System.out.println("termino m2");
  }
  public static void m1(){
    try{
        m2();



    }
    catch(){
      
    }



  }

}
