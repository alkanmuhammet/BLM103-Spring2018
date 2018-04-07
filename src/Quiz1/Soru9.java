package Quiz1;

/**
 * @file Soru9.java
 * @date Apr 7, 2018 , 1:44:50 PM
 * @author Muhammet Alkan
 */
public class Soru9 {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;

            if (number == 10 || number == 11) {
                continue;
            }
            sum += number;
        }

        System.out.println("The sum is " + sum);
    }
}
