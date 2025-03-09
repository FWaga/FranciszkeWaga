import java.util.Scanner;

public class lab2_5 {
    public static void warunek(boolean znizka, boolean premia){
        if(!(znizka || !premia)){
            System.out.println("Mozesz kupic samochod, znizki na samochod nie ma.");
        }
        else if(!znizka || !premia) {
            System.out.println("Zakup samochodu trzeba odlozyc na pozniej, znizki na samochod nie ma.");
        }
        else if(znizka || premia){
            System.out.println("Mozesz kupic samochod");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Czy jest znizka? (true/false): ");
        boolean znizka = scanner.nextBoolean();
        System.out.print("Czy otrzymales premie? (true/false): ");
        boolean premia = scanner.nextBoolean();
        warunek(znizka, premia);
    }
}
