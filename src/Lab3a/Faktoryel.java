package Lab3a;

import java.util.Scanner;

public class Faktoryel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n : ");
        int n = input.nextInt();

        int carpim = 1;
        for (int i = 1; i <= n; i++) {
            carpim *= i;
            // System.out.println(carpim);
        }

        System.out.println("n! = " + carpim);

    }
}
