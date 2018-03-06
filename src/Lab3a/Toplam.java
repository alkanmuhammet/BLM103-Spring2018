package Lab3a;

import java.util.Scanner;

public class Toplam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sınır : ");
        int max = input.nextInt();

        System.out.println("Toplam " + max + " sayısını aşınca dur");

        int toplam = 0;     // doğru tanımlama, döngü dışında olmalı
        for (int i = 0; i < 100; i++) {
            // int toplam = 0;   // for döngüsünün dışında tanımlanmalı
            toplam += i;        // toplam = toplam + i

            if (toplam > max) {
                System.out.println(i + " sayısı eklenince sınır geçildi. Toplam = " + toplam);
                break;
            }
        }

    }
}
