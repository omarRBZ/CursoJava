class SportsCar{

  public String goFast(){
    return "220km/hr";

  }

}

class Car extends SportsCar{
  public void implementacion(){
    goFast();
  }

  public void velocidad(){
    SportsCar ve= new SportsCar();
    ve.goFast();

  }


}
