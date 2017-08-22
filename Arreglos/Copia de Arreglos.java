import java.util.Scanner;
public class Arreglos {

	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int tamObj = input.nextInt();
		int tamArr = input.nextInt();
		int[][] numeros = new int[tamObj][tamArr];
		for(int i = 0; i < numeros.length; i++){
			for(int j = 0; j < numeros[i].length; j++){
				int numero = input.nextInt();
				numeros[i][j] = numero;
			}
		}
		System.out.println();
		for(int i = numeros.length -1 ; i >= 0; i--){
			for(int j = 0; j < numeros[i].length; j++){
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i < numeros.length; i++){
			for(int j = numeros[i].length - 1; j >= 0; j--){
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}

	}
}
