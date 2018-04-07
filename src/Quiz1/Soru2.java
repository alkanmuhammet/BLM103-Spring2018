package Quiz1;

import java.util.Scanner;

/**
 * @file Soru2.java
 * @date Apr 7, 2018 , 1:16:53 PM
 * @author Muhammet Alkan
 */
public class Soru2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = keyboard.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = keyboard.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int sayi3 = keyboard.nextInt();

        for (int i = sayi1; i <= sayi2; i = i + sayi3) {
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
}
