package Lab3a;

import java.util.Scanner;

public class Dongu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n sayısına kadar olan çift ve tek sayılar");

        System.out.print("n : ");
        int n = input.nextInt();

        System.out.print("Çift Sayılar: ");
        for (int i = 0; i < n; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nTek Sayılar: ");
        int i = 0;
        while (i < n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i = i + 1;  // i += 1;
        }

        System.out.println();
    }
}
