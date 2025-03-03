import java.util.Arrays;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lstud;
        int min = 1;
        do{
            System.out.print("podaj liczbe studentow: ");
            lstud = scanner.nextInt();

            if(lstud<min){
                System.out.println("W grupie nie moze byc mniej niz "+ min +" studentow");
            }
        }while(lstud<min);
        //System.out.println(lstud);

        int i =0;
        int suma =0;
        while(i<lstud){
            System.out.print("Podaj punkty studenta "+ (i+1) +": ");
            suma += scanner.nextInt();
            //System.out.println(suma);
            i++;
        }
        float srednia = suma/lstud;
        System.out.print("Srednia wynosi: "+srednia);
    }
}