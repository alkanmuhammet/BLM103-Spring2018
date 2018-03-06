package Lab3a;

public class Bolunme {

    public static void main(String[] args) {
        System.out.println("0-100 aralığında, 3 e bölünebilen fakat 7 ye bölünemeyen sayılar :");

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
