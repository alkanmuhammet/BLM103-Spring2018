package Lab5;

/**
 * @file UpperLowerChar.java
 * @date Mar 19, 2018 , 4:07:47 PM
 * @author Muhammet Alkan
 */
public class UpperLowerChar {

    public static void main(String[] args) {

        System.out.println("F + 32 : " + (char) ('F' + 32)); // int to char
        System.out.println("b - 32 : " + (char) ('b' - 32)); // int to char

        System.out.println("upper chars, " + (int) 'A' + " to " + (int) 'Z');  // char to int
        System.out.println("lower chars, " + (int) 'a' + " to " + (int) 'z');  // char to int

        String text = "Fatih Sultan Mehmet Vakif University - FSMVU";

        System.out.println("before : " + text);
        System.out.println("after  : " + upperLower(text));
    }

    private static String upperLower(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 65 && c <= 90) {   // upper chars
                // result += (char) (c + 32);
                result += (c + "").toLowerCase();
            } else if (c >= 97 && c <= 122) {   // lower chars
                result += (char) (c - 32);
            } else {    // other characters not in the English alphabet
                result += c;
            }
        }

        return result;
    }

}
