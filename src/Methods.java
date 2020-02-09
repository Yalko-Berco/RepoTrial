import java.util.Scanner;

public class Methods {

    public static void numeralSum() {
        Scanner s = new Scanner(System.in);
        System.out.println("sayi: ");
        int a = s.nextInt();
        int toplam;
        for (toplam = 0; a > 0; a /= 10) {
            toplam += a % 10;
        }
        System.out.println("rakamlar toplami: " + toplam);
    }


}
