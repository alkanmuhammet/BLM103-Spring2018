package Lab1a;

import java.util.Scanner;

public class DaireAlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int r = 7;   
        System.out.print("r : ");
        int r = input.nextInt();

        double pi = 3.14;

        double alan = (pi * r * r);
        System.out.println("sonuç : " + alan);
    }

}
