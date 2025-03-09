import java.util.Arrays;

public class lab4_7 {
    public static void main(String[] args) {
        String[] array1 = {"Szatan", "666", "Diabeuuu", "Smierc", "Blak Metal"};
        String[] array2 = {"Szatan", "666", "Diabeuuu", "Smierc", "Blak Metal"};

        boolean areEqual = Arrays.equals(array1, array2);

        if (areEqual) {
            System.out.println("Tablice są identyczne.");
        } else {
            System.out.println("Tablice różnią się.");
        }
    }
}
