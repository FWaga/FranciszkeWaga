import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz liczbe: ");
        int liczba = scanner.nextInt();
        System.out.println(czy(liczba));
    }
    public static boolean czy(int liczba){
        return liczba % 3 == 0 && liczba % 5 == 0;
    }
}
