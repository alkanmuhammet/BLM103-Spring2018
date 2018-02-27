package Lab1b;

import java.util.Scanner;

public class DikdortgenAlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Kısa ve uzun kenar uzunluklarını giriniz :");
        int kısa_kenar = input.nextInt();
        int uzun_kenar = input.nextInt();
        
        int alan = kısa_kenar * uzun_kenar;
        System.out.println("Dikdötgenin alanı : " + alan);
    }

}
