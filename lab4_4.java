import java.util.Scanner;

public class lab4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Podaj 5 słów:");
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }

        System.out.println("\nSłowa w odwrotnej kolejności, z odwróconymi literami:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(new StringBuilder(words[i]).reverse()+" ");
        }
        System.out.println("Zaskakujaco brzmi jak Finski...");
    }
}
