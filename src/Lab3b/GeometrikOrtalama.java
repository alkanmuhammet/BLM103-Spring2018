package Lab3b;

import java.util.Scanner;

public class GeometrikOrtalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 sayısından girilen n sayısına kadar olan bütün sayıların geometrik ortalaması");
        
        System.out.print("n: ");
        int sayi = input.nextInt();
        
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        
        System.out.println(sayi + " sayısının faktöriyeli : " + faktoriyel);

        double geometrikOrtalama = Math.pow(faktoriyel, 1.0 / sayi);
        System.out.println("Geometrik ortalama : " + geometrikOrtalama);

    }

}
