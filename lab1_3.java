import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbe : ");
        Scanner sc = new Scanner(System.in);
        int liczba1 = sc.nextInt();
        System.out.println(parzysta(liczba1));
        }
        public static boolean parzysta(int liczba){
            return liczba % 2 == 0;
        }
    }