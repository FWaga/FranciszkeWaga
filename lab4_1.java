import java.util.Arrays;
import java.util.Random;

public class lab4_1 {
    public static void main(String[] args) {
        int rozmiar = 10;
        int min = 1, max = 100;

        int[] tablica = new int[rozmiar];
        Random rand = new Random();

        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = rand.nextInt(max - min + 1) + min;
        }

        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        double srednia = (double) suma / rozmiar;

        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(tablica));
        System.out.println("Suma elementów: " + suma);
        System.out.println("Średnia elementów: " + srednia);

        sortArray(tablica);
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablica));
    }

    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
