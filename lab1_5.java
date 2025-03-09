import java.util.Scanner;

public class lab1_5 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println(liczba*liczba*liczba);
    }
}
