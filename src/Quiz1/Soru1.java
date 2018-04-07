package Quiz1;

import java.util.Scanner;

/**
 * @file Soru1.java
 * @date Apr 7, 2018 , 1:12:58 PM
 * @author Muhammet Alkan
 */
public class Soru1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("sayı giriniz: ");
            sayi = keyboard.nextInt();
            
            toplam += sayi;
        } while (sayi != 0);

        System.out.println("toplam : " + toplam);
    }
}
