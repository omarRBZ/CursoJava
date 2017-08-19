import java.util.Scanner;
class Elemeto {
	int valor;
	Elemeto siguiente;



}

class Lista{
Elemeto inicio;// elemeto inicio almacena el inicio de la lista
	public void guardar(int valor ){
		Elemeto nuevo=new Elemeto();//elemeto nuevo almacena un nuevo elemnto de la Lista
		nuevo.valor=valor;
		Elemeto actual = null;//elemeto actual almacena el elemnto ingresado;
		if(inicio== null){
			inicio=nuevo;
			nuevo.siguiente=null;
			return;
		}
		actual=inicio;

		while(actual.siguiente !=null){
			actual= actual.siguiente;

		}
		actual.siguiente=nuevo;
	}

	public void mostrar(){
		Elemeto actual = inicio;
		while (actual !=null){
			System.out.println(actual.valor);
			actual=actual.siguiente;
		}
		System.out.println(actual.valor);
		System.out.println();


	}





}
public class Listas {
	public static void main (String []args ){
		Scanner leer = new Scanner(System.in);
		Lista list = new Lista();
		String valor;
		while(true){
		System.out.print("introduce el valor");
		valor = leer.nextLine();
		char result = valor.charAt(0);
		int final  =valor.length();
		String x = valor.substring(2,final);
		int valornumerico= Character.getNumericValue(x);

		if (result== 'i'){
			list.guardar(valornumerico);
		}
		else if (result=='q'){
			list.mostrar();
		}
}




}
}
