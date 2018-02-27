package Lab1a;

import java.util.Scanner;

public class DikdortgenCevre {

    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.println("kenar 1 : ");
        int kenar1 = input.nextInt();

        System.out.println("kenar 2 : ");
        int kenar2 = input.nextInt();

        int cevre = (kenar1 + kenar2) * 2;
        System.out.println("Dikdörtgenin çevresi : " + cevre);
    }

}
