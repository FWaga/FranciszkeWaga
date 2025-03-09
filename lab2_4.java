import java.util.Scanner;

public class lab2_4 {
    public static void warunek(boolean padaDeszcz, boolean jestAutobus) {
        if (padaDeszcz && jestAutobus) {
            System.out.println("Wez parasol, dostaniesz sie na uczelnie.");
        } else if (padaDeszcz && !jestAutobus) {
            System.out.println("Nie dostaniesz sie na uczelnie.");
        } else if (!padaDeszcz && jestAutobus) {
            System.out.println("Dostaniesz się na uczelnie, milego dnia i dobrej pogody.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Czy pada deszcz? (true/false): ");
        boolean deszcz = scanner.nextBoolean();
        System.out.print("Czy jest autobus? (true/false): ");
        boolean autobus = scanner.nextBoolean();
        warunek(deszcz, autobus);
    }
}
