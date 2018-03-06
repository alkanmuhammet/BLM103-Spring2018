package Lab3a;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rndm = new Random();
        int randomSayi = rndm.nextInt(100);     // 0-100 aralığında random integer(tam sayı), 100 hariç 
        // System.out.println("random sayı : " + randomSayi);

        int hak = 5;
        int tahmin;

        while (hak > 0) {
            System.out.print("tahmin : ");
            tahmin = input.nextInt();

            if (tahmin == randomSayi) {
                System.out.println("Kazandınız !!!");
                break;
            } else if (tahmin < randomSayi) {
                System.out.println("Küçük tahmin");
            } else {
                System.out.println("Büyük tahmin");
            }

            hak--;
        }

        if (hak == 0) {
            System.out.println("Kazanamadınız ! sayı : " + randomSayi);
        }
    }
}
