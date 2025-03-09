import java.util.Random;
import java.util.Arrays;

public class lab4_2 {
    public static void main(String[] args) {
        int[] tablica4 = new int[4];
        int[] tablica5 = new int[5];

        Random rand = new Random();
        int min = 1, max = 100;

        for (int i = 0; i < tablica4.length; i++) {
            tablica4[i] = rand.nextInt(max - min + 1) + min;
        }
        for (int i = 0; i < tablica5.length; i++) {
            tablica5[i] = rand.nextInt(max - min + 1) + min;
        }

        System.out.println("Tablica 4-elementowa: " + Arrays.toString(tablica4));
        System.out.print("Co drugi element: ");
        wypiszCoDrugi(tablica4);

        System.out.println("\nTablica 5-elementowa: " + Arrays.toString(tablica5));
        System.out.print("Co drugi element: ");
        wypiszCoDrugi(tablica5);
    }

    public static void wypiszCoDrugi(int[] tablica) {
        for (int i = 0; i < tablica.length; i += 2) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
