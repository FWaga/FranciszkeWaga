import java.util.Scanner;

public class lab2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a,b,c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Funkcja kwadratowa to: f(x)= " +a+ "x^2 + " + b + "x +" + c + "\nMiejsca zerowe to: ");
        double delta = (b*b) - (4*a*c);
        if(delta > 0) {
        double x1 = ((-b) -(Math.sqrt(delta)))/2*a;
        double x2 = ((-b) +(Math.sqrt(delta)))/2*a;
        System.out.println("x1 = " + x1 + "\nx2 = " + x2);}
        if(delta == 0){System.out.println("x = " + ((-b)/(2*a)));}
        else {System.out.println("Brak miejsc zerowych");}
    }
}
