class Vehiculo{
  static String mensaje="estatica";
  protected void moverse()
  {
    System.out.println("moviendose");

  }

}
class Estereo{
  public void reproducirMusica(){
    System.out.println("reproducir musica");
  }
}

class Carro extends Vehiculo{
  Estereo estereo= new Estereo();
  public  void moverse(){
    System.out.println("moviendose por tierra");

  }
  public void Reversa(){
    System.out.println("reversa");
  }
  public void ReproducirMusica(){
    estereo.reproducirMusica();
  }
}
class Avion extends Vehiculo{
  public void moverse(){
    System.out.println("moviendose por aire ");

  }
  public void despegar(){
    System.out.println("despegar");
  }
}
class Deportivo extends Carro{
  public void usarTurbo(){
    System.out.println("usar turbo ");
  }
}
class Jet extends Avion{
  public void velocidadDelSonido(){
    System.out.println("velocidad del sonido");
  }
}


class TestVehiculo
{
public static void probarVehiculo(Vehiculo v){
  v.moverse();
  if ( v instanceof Carro ){
    Carro c= (Carro)v;
    Carro c1 =(Carro)v;
    c.Reversa();

    c.ReproducirMusica();


  }
  if (v instanceof Avion) {
    Avion a= (Avion)v;
    a.despegar();

  }
  if (v instanceof Deportivo)
  {
    Deportivo d= (Deportivo)v;
    d.usarTurbo();
  }
  if(v instanceof Jet)
  {
    Jet J= (Jet)v;
    J.velocidadDelSonido();
  }

}

  public static void main (String[]args){
    Carro c=new Carro();
    Avion a= new Avion();
    Deportivo d=new Deportivo();
    Jet j= new Jet();


    Vehiculo vc=new Carro();
    Vehiculo va= new Avion();
    Vehiculo vd = new Deportivo();
    Vehiculo vj= new Jet();


        c.moverse();
        a.moverse();
        d.moverse();
        j.moverse();
        System.out.println("-----------------------------");
        vc.moverse();
        va.moverse();
        vd.moverse();
        vj.moverse();
        System.out.println("-----------------------------");
        probarVehiculo(vc);
        System.out.println("-----------------------------");
        probarVehiculo(va);
        System.out.println("-----------------------------");
        probarVehiculo(vd);
        System.out.println("-----------------------------");
        probarVehiculo(vj);

  }


}
