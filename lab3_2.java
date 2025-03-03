import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args){
        System.out.println("Podaj 10 liczb: ");
        Scanner scanner = new Scanner(System.in);
        int suma=0;
        int ujemne=0;
        int dodatnie=0;
        for(int i=0; i<10; i++){
            int temp=suma;
            suma += scanner.nextInt();
            if (temp>suma){ujemne++;}
            if (temp<suma){dodatnie++;}
        }
        System.out.println("Podanych liczb dodatnich: "+dodatnie);
        System.out.println("Podanych liczb ujemnych: "+ujemne);
        System.out.println("Suma podanych liczb: "+suma);
    }
}
