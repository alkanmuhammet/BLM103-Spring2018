package Lab2;

import java.util.Scanner;

/**
 * @file BMI.java
 * @date Feb 26, 2018 , 5:28:56 PM
 * @author Muhammet Alkan
 */
public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg) :");
        int weight = input.nextInt();

        System.out.print("Enter height (cm) :");
        double height = input.nextInt();

        height = height / 100;

        double bmi = weight / (height * height);

        System.out.println("bmi : " + bmi);

        if (bmi < 15) {
            System.out.println("Very severely underweight");
        } else if (bmi < 16) {
            System.out.println("Severely underweight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal (healthy weight)");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi < 35) {
            System.out.println("Moderately obese");
        } else if (bmi < 40) {
            System.out.println("Severely obese");
        } else {
            System.out.println("Very severely obese");
        }
    }

}
