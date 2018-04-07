package Quiz1;

/**
 * @file Soru10.java
 * @date Apr 7, 2018 , 1:45:09 PM
 * @author Muhammet Alkan
 */
public class Soru10 {

    public static void main(String[] args) {

        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;

            sum += number;

            if (sum >= 100) {
                break;
            }
        }

        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
