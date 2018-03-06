package Lab3b;

import java.util.Scanner;

public class Dongu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Girilen sayının, 1-100 aralığında kaç tane böleni vardır");
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % sayi == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n" + count + " tane sayı, " + sayi + " sayısına bölünür");
    }
}
