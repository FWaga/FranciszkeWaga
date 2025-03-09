public class lab4_3 {
    public static void main(String[] args) {
        String[] slowa = {"wulgaryzm", "kolejnywulgaryzm", "bardzonieladnywulgaryzm", "pis", "po"};

        System.out.println("Elementy tablicy w wersji z wielkimi literami:");
        for (String slowo : slowa) {
            System.out.println(slowo.toUpperCase());
        }
    }
}
