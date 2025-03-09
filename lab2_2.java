import java.util.Scanner;

public class lab2_2 {
    public static double a(double x) {
        if (x > 0) return 2 * x;
        else if (x == 0) return 0;
        else return -3 * x;
    }
    public static double b(double x) {
        if (x >= 1) return x * x;
        else return x;
    }
    public static double c(double x) {
        if (x > 2) return 2 + x;
        else if (x == 2) return 8;
        else return x - 4;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartosc x: ");
        double x = scanner.nextDouble();
        System.out.println("a(x) = " + a(x));
        System.out.println("b(x) = " + b(x));
        System.out.println("c(x) = " + c(x));
        scanner.close();
    }
}
