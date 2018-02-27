package Lab2;

import java.util.Scanner;

/**
 * @file NotOrtalama.java
 * @date Feb 26, 2018 , 6:45:33 PM
 * @author Muhammet Alkan
 */
public class NotOrtalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double vizeNot, quizNot, finalNot, odevNot;

        System.out.print("Vize notu giriniz : ");
        vizeNot = input.nextDouble();
        System.out.print("Quiz notu giriniz : ");
        quizNot = input.nextDouble();
        System.out.print("Final notu giriniz : ");
        finalNot = input.nextDouble();
        System.out.print("Ödev notu giriniz : ");
        odevNot = input.nextDouble();

        double ortalama =   vizeNot * (0.25) +
                            quizNot * (0.12) +
                            finalNot * (0.48) +
                            odevNot * (0.15);
        
        System.out.println("Ortalama : " + ortalama);
        
        if(ortalama >= 85){
            System.out.println("AA");
        }
        else if(ortalama >= 70){
            System.out.println("BA");
        }
        else if(ortalama >= 50){
            System.out.println("CC");
        }
        else {
            System.out.println("FF");
        }
    }
}
