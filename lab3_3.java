import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Podaj ilosc elementow ciagu: ");
            n = scanner.nextInt();

            if(n<=0){
                System.out.println("Liczba elementow ciagu nie moze byc mniejsza od 1!!!");
            }
        }while (n<=0);

        int suma=0;
        for(int i=1; i<n+1; i++){
            suma += i;
        }
        System.out.println("Suma wszystkich liczb parzystych w tym ciagu wynosi: "+suma);
    }
}
