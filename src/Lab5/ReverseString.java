package Lab5;

/**
 * @file ReverseString.java
 * @date Mar 19, 2018 , 5:14:54 PM
 * @author Muhammet Alkan
 */
public class ReverseString {

    public static void main(String[] args) {
        String text = "FSMVU";

        String reversedText = reverse(text);

        System.out.println("before reverse : " + text);
        System.out.println("after reverse  : " + reversedText);
    }

    public static String reverse(String text) {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }
}
