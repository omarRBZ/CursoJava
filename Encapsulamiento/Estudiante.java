class DatosDeEstudiante{

  enum genero{

  }
  private String nombre;
  private String ApellidoPaterno;
  private String ApellidoMaterno;
  int edad;
  Char sexo;
  String carrera;

  public String getNombre(){
    return nombre;
  }
  public String getApellidoMaterno(){
    return ApellidoMaterno;

  }
  public String getApellidoPaterno(){
    return ApellidoPaterno;
  }

  public int getEdad(){
    return edad;
  }

  public char getSexo(){
    return sexo;
  }
  public String getCrrera(){
    return carrera;
  }

  public void setNombre(String nombre){
    this.nombre=nombre
  }
  public void setApellidoPaterno(String ApellidoPaterno){
    this.ApellidoPaterno=ApellidoPaterno;
  }
  public void setApellidoMaterno(String ApellidoMaterno){
    this.ApellidoMaterno=ApellidoMaterno;
  }

  public void setEdad(int edad){
    this.edad=edad;

  }



}
