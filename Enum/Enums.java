enum CoffeZice{
  SMALL(5){
    public String getLidCode(){
      return "C";
    }
    public String getDescuento(){
      return "15% de descuento";
    }
  },
  BIG(8){
    public String getDescuento(){
      return "10% de descuento";
    }

  },
  HUGE(10),
  OVERWHELMING(16){
    public String getLidCode(){
      return "A";
    }
    public String getDescuento(){
      return "5% de descuento";
    }
  };
  CoffeZice(int ounces){
    this.ounces=ounces;
  }
  private int ounces;

  public int getOunces(){
    return ounces;
  }
  public String getLidCode() {
    return "b";


  }
  public String getDescuento(){
    return "0% de descuento";
  }

}
class Coffe{

  CoffeZice size;
  public static void main (String[]args){
    Coffe drink1=new Coffe();
    Coffe drink2= new Coffe();
    drink1.size=CoffeZice.BIG;
    drink2.size=CoffeZice.OVERWHELMING;
    System.out.println(drink1.size.getOunces());
    for (CoffeZice cs : CoffeZice.values()) {
      System.out.println(cs+" "+cs.getOunces()+" "+cs.getLidCode()+" "+cs.getDescuento());

    }

  }

}
