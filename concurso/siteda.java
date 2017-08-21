import java.util.Scanner;
public class siteda{
 public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   int num1=leer.nextInt();
   int num2=leer.nextInt();
   int num3;
   int temporlInicio=num1;
   int temporalFin=num2;
   int cont=0;

   while(true){
     cont++;
       num3=num1+num2;
       if (num3>10) {
         num3=num3-10;
         cont++;
       }
       num1=num3;
       num3=num1+num2;
       if (num3>10) {
         num3=num3-10;
         cont++;

       }
       num2=num3;
       if (num1==temporlInicio && num2==temporalFin) {
         break;

       }
   }
   System.out.println(cont);

  }
}
