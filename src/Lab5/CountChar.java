package Lab5;

/**
 * @file CountChar.java
 * @date Mar 19, 2018 , 4:44:33 PM
 * @author Muhammet Alkan
 */
public class CountChar {
    public static void main(String[] args) {
        String text = "Fatih Sultan Mehmet Vakif University";
        char c = 'u';
        
       // System.out.println(text.toLowerCase());
       // System.out.println(text.charAt(2) == c);
        
        int count = countChar(text, c);
        System.out.println("count : " + count);
    }
    
    public static int countChar(String text, char c){
        int counter = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == c)
                counter++;
        }
        
        return counter;
    }
}
