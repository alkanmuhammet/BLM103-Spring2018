package Lab3a;

import java.util.Scanner;

public class EnKucukEnBuyuk {

    public static void main(String[] args) {
        System.out.println("4 ile 133 arasında, girilen n sayısını bölebilen en küçük ve en büyük sayının farkı");
        //  diğer bir deyişle, 4 ile 133 arasında, girilen n sayısının en küçük ve en büyük katlarının farkı

        Scanner input = new Scanner(System.in);

        System.out.print("n : ");
        int n = input.nextInt();

        int enKucuk = 0, enBuyuk = 0;

        for (int i = 4; i < 133; i++) {
            if (i % n == 0) {

                if (enKucuk == 0) {
                    enKucuk = i;
                }

                enBuyuk = i;
            }
        }

        System.out.println("en küçük kat sayısı : " + enKucuk);
        System.out.println("en büyük kat sayısı : " + enBuyuk);
        System.out.println("fark : " + (enBuyuk - enKucuk));
    }
}
