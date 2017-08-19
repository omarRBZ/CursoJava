enum capitales{
  MORELOS("cuernavaca"),PUEBLA("PUEBLA"),EDOMEX("TOLUCA");

  capitales(String capitales)
  {
    this.capitales=capitales;
  }
  private String capitales;

  public String getCapital(){
    return capitales;
  }
}

class Estados{
  capitales cp;
  public static void main(String[]args){
    Estados es=new Estados();
    es.cp=capitales.MORELOS;
    System.out.println(es.cp.getCapital());
  }


}
