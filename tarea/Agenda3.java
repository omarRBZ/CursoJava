import java.util.Scanner;
import java.util.ArrayList;
public class Agenda3{
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean [][][]Agenda= new boolean [200][13][32];
    ArrayList<String> rechazados=new ArrayList<String>();
    int day,month,year;
    int numeroDeEventos=leer.nextInt();
    leer.nextLine();
    for (int i=1;i<=numeroDeEventos ;i++ ) {
        String evento = leer.nextLine();
        day=Integer.parseInt(evento.substring(0,2));
        year=Integer.parseInt(evento.substring(7,10));
        month=Integer.parseInt(evento.substring(3,5));
        if (Agenda[year][month][day]==false) {
        Agenda[year][month][day]=true;

        }
        else{
        rechazados.add(evento);
        }
    }
    System.out.println(rechazados.size());
    for (String e:rechazados ) {
      System.out.println(e);

    }
  }
}
