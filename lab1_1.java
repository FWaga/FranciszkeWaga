import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        System.out.print("Twoje imie to: " + imie + "\nTwoj wiek to: " + wiek);
    }
}
