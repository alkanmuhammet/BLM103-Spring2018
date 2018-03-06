package Lab3b;

import java.util.Scanner;

public class EnBuyuk {

    public static void main(String[] args) {
        System.out.println("Girilen iki sayı için, 0-100 aralığındaki en büyük katlarını bul, farkı yazdır (uzaklık)");
        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayı : ");
        int sayi1 = input.nextInt();

        System.out.print("ikinci sayı : ");
        int sayi2 = input.nextInt();

        int enBuyukKat1 = 0, enBuyukKat2 = 0;
        for (int i = 0; i < 100; i++) {
            if (i % sayi1 == 0) {
                enBuyukKat1 = i;
            }

            if (i % sayi2 == 0) {
                enBuyukKat2 = i;
            }
        }

        System.out.println("ilk sayı için en büyük kat : " + enBuyukKat1);
        System.out.println("ikinci sayı için en büyük kat : " + enBuyukKat2);
        System.out.println("fark : " + Math.abs(enBuyukKat2 - enBuyukKat1));
    }
}
