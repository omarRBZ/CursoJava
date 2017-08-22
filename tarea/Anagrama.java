import java.util.Scanner;
public class Anagrama{
	public static void main(String []args){
		Scanner lr=new Scanner(System.in);
		String palabra1=lr.nextLine();
		String palabra2=lr.nextLine();
		 String pn="";
		if(palabra1.length()!=palabra2.length()){
		System.out.println("no es anagrama");
		}
		else {

			for(int i=0;i<palabra1.length();i++){
				for(int k=0;k<palabra2.length();k++){
					if(palabra1.charAt(i)== palabra2.charAt(k)){
						pn=pn+palabra2.charAt(k);
						System.out.println(pn);
						break;
					}
				}
			}
			if(palabra1.equals(pn)) {
				System.out.println("es anagrama");
			}

			else{
				System.out.println("no es anagrama");
			}
			System.out.println(pn);
		}
	}
}
