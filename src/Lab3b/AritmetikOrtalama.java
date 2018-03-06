package Lab3b;

import java.util.Scanner;

public class AritmetikOrtalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kaç sayının ortalaması alınacak : ");
        int n = input.nextInt();

        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int sayi = input.nextInt();

            toplam += sayi;
        }

        System.out.println("aritmetik ortalama : " + ((double) toplam / n));
    }
}
