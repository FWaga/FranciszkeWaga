import java.util.Random;
import java.util.Scanner;

public class lab1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        System.out.println("Podaj dolna granice: ");
        int j = scanner.nextInt();
        System.out.println("Podaj dolna granice: ");
        int h = scanner.nextInt();
        int a = random.nextInt(j,h); System.out.println("a="+a);
        int b = random.nextInt(j,h); System.out.println("b="+b);
        int c = random.nextInt(j,h); System.out.println("c="+c);
        System.out.println(trojkat(a,b,c));
    }
    public static boolean trojkat(int liczba1, int liczba2, int liczba3){
        return (liczba1*liczba1) + (liczba2*liczba2) == (liczba3*liczba3);
    }
}
