package Lab1b;

import java.util.Scanner;


public class DaireCevre {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapını giriniz :");
        int r = input.nextInt();
        
        double pi = 3.14;
        
        double cevre = (2 * pi * r);
        System.out.println("Dairenin çevresi : " + cevre);
    }
}
