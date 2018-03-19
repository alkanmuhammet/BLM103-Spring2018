package Lab5;

/**
 * @file IgnoreChar.java
 * @date Mar 19, 2018 , 6:13:02 PM
 * @author Muhammet Alkan
 */
public class IgnoreChar {

    public static void main(String[] args) {
        String text = "Fatih Sultan Mehmet Vakif University";
        char c = 'a';

        String result = ignoreChar(text, c);
        System.out.println("result : " + result);
    }

    private static String ignoreChar(String text, char c) {
        String ignoredText = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != c) {
                ignoredText += text.charAt(i);
            }
        }

        return ignoredText;
    }
}
