package Lab1b;

import java.util.Scanner;

public class Denklem {

    public static void main(String[] args) {
        Math.pow(5, 3);     // 5 üzeri 3  = 125

        Math.sqrt(16);      // karekök 16 = 4

        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();
        double z = input.nextInt();

        double solTaraf = ((x * y) * (Math.pow(x, 3) + 3)) / (Math.sqrt(z - (y / (5 * x))));
        double sagTaraf = ((z * (3 / (x * y)) + y) / (7 + (z / y))) / ((y * z - (3 * x / (6 - y))) / Math.pow(y, x));

        double sonuc = solTaraf + sagTaraf;

//        System.out.println("sonuç : " + sonuc);
    }
}
