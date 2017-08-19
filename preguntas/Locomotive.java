

public class Redwood extends Tree {

 public static void main(String[] args)
 {
 new Redwood().go();
 }

 void go()
{
 go2(new Tree(), new Redwood());
 // TIENE QUE VER EN EL ARBOL DE ERENCIA
 //ES LA MISMA CLASE QUE Redwood?
// ES UNA SUBCLASE  DE  Tree?
// IMPLEMENTA UNA INTERFAZ LLAMADA TREE?
 go2((Redwood) new Tree(), new Redwood());
 }


 void go2(Tree t1, Redwood r1)
{
  // TIENE QUE VER EN EL ARBOL DE ERENCIA 
 // se ejecuta es la misma clase que tree ?NO
 // es una subclase de tree?SI
 //implementa una interfaz llamada tree?NO
 Tree t2 = (Tree)r1;
 }
//CASTEO CORRECTO



 }
 class Tree { }
