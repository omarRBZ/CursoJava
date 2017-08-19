abstract class Pc{
  private int memoria;
  private int Hhd;
  private String procesador;

  public void SetMemoria(int memoria){
    this.memoria=memoria;

  }

  public void setHhd(int Hhd){
    this.Hhd=Hhd;

  }

  public void setProcesador(String procesador){
    this.procesador=procesador;

  }

  public int getMemoria(){
    return memoria;
  }

  public int getHhd(){
    return Hhd;

  }
  public String getProcesador(){
    return procesador;

  }

}


class Portatil extends Pc{

  private String bateria;
  private String modelo;
  private String pantalla;

  public void pantalla(String pantalla){
    this.pantalla=pantalla;
  }

  public void setModelo(String modelo){
    this.modelo=modelo;
  }
  public void setBateria(){
    this.bateria=bateria;
  }

  public String getBateria(){
    return bateria;
  }
  public String getModelo(){
    return modelo;
  }
  public String getPantalla(){
    return pantalla;
  }


}
class Escritorio extends Pc
{

  private String accesorios;

  public void setAccesorios(String accesorios){
    this.accesorios=accesorios;
  }

  public String getAccesorios(){
    return accesorios;
  }



}



public class TestPc{

  public static void probarPC(Pc pc){

    if(pc instanceof Portatil){
      System.out.println(0);
      pc.setProcesador("intel core I7");
      pc.setHhd(500);
      pc.SetMemoria(16);
    

      System.out.println(pc.getMemoria());
      System.out.println(pc.getProcesador());
      System.out.println(pc.getHhd());

    }
    if (pc instanceof Escritorio)
      System.out.println(1);
      pc.setProcesador("intel core i3");
      pc.setHhd(500);
      pc.SetMemoria(16);



  }

public static void main(String[] args) {
  Pc pc;
  pc=new Portatil();
  probarPC(pc);
  Pc pc1=new Escritorio();
  probarPC(pc1);

}



}
