public class VariableLocal{
int x=25;
public int suma(){
  int y=25;
  int suma =y+x;
  return suma;


}
public static void main (String []args){
  VariableLocal obj= new VariableLocal();
  System.out.println(obj.suma());
}
}
