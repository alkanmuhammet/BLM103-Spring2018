package Lab3b;

import java.util.Scanner;

public class Toplam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sınır : ");
        int max = input.nextInt();

        System.out.println("Toplam " + max + " sayısını aşınca dur, sadece çift sayılar");

        // sadece çift sayılar toplama dahil
        int toplam = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                toplam += i;

                if (toplam > max) {
                    System.out.println(i + " sayısı eklenince sınır geçildi. Toplam : " + toplam);
                    break;
                }
            }
        }
    }
}
