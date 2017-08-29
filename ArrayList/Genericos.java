class Cajon<E>{
  public void guardar(E o){
    System.out.println("guardado");
  }
}

class cable {}
class playera{}
class calcetin{}

  class TestsCables{
    Cajon<cable> cajonCables= new Cajon<cable>();
    Cajon<playera> cajonPlayera=new Cajon<playera>();

    cajonCables.guardar(new cable());
    cajonCables.guardar(new playera());
    cajonCables.guardar(new calcetin());
  }
