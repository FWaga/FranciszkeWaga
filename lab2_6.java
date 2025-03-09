import java.util.Scanner;

public class lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby a,b: ");
        int liczba1=scanner.nextInt();
        int liczba2=scanner.nextInt();
        scanner.nextLine(); //!!!
        System.out.print("Chcesz dodac (a), odjac (s), pomnozyc (m), podzielic (d), reszte z dzielenia (r): ");
        String dzialanie=scanner.nextLine();
        if(dzialanie.equals("a")){
            System.out.println(liczba1 + liczba2);
        }
        else if(dzialanie.equals("s")){
            System.out.println(liczba1 - liczba2);
        }
        else if(dzialanie.equals("m")){
            System.out.println(liczba1 * liczba2);
        }
        else if(dzialanie.equals("d")){
            if(liczba2==0){System.out.println("possiblen't");}
            else{
            System.out.println(liczba1 / liczba2);}
        }
        else if(dzialanie.equals("r")){
            System.out.println(liczba1 % liczba2);
        }
        else{System.out.println("nie ma takiego dzialania");}
    }
}
