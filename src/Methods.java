import java.util.Scanner;

public class Methods {

    public static void numeralSum() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a = scan.nextInt();

        int adet = 0;
        int toplam = 0;

        while (a > 0) {

            toplam = (a % 10) + toplam;
            a /= 10;
            adet++;
        }
        System.out.println("Basamak Toplamı: " + toplam);
    }


}
