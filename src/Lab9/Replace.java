package Lab9;

public class Replace {

    public static void main(String[] args) {

        String s = "Fatih Sultan Mehmet";

        System.out.println(replace('S', 'T', s));
    }

    public static String replace(char c1, char c2, String s) {
        String retString = "";

        for (int i = 0; i < s.length(); i++) {
            char stringChar = s.charAt(i);

            if (stringChar == c1) {
                retString += c2;
            } else {
                retString += stringChar;
            }
        }

        return retString;
    }
}
