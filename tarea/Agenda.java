import java.util.Scanner;
public class Agenda {
	public int mes;
	public int dia;
	public int ano;
	public String etiqueta;
	Agenda(int mes, int dia, int ano, String etiqueta){
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
		this.etiqueta = etiqueta;
	}

}

class Test {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int numeroEventos = input.nextInt();
		Agenda[] fechas = new Agenda[numeroEventos];

		for(int i = 0; i < numeroEventos; i++){
			int mes = input.nextInt();
			int dia = input.nextInt();
			int ano = input.nextInt();
			String etiqueta = input.nextLine();
			Agenda fecha  = new Agenda(mes, dia, ano, etiqueta);
			fechas[i] = fecha;
		}
		Agenda ant = new Agenda(0,0,0,"");
		for(int i = 0; i < fechas.length; i++){
			System.out.print(fechas[i].ano+",");
		}

	}
}
