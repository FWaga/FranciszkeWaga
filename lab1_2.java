import java.util.Scanner;

public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Suma: " + (liczba1 + liczba2) + "\nRoznica: " + (liczba1 - liczba2) + "\nIloczyn: " + (liczba2*liczba1));
    }
}
