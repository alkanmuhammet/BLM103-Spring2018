package Lab3b;

import java.util.Scanner;

public class TamBolenler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Girilen n sayısının tam bölenleri");
        
        System.out.print("n : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + "  ");
            }
        }
        
        System.out.println();
    }
}
