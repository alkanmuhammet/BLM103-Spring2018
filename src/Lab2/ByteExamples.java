package Lab2;

/**
 * @file ByteExamples.java
 * @date Feb 26, 2018 , 5:42:36 PM
 * @author Muhammet Alkan
 */
public class ByteExamples {

    public static void main(String[] args) {
        byte a = 29;                            // 00011101
        byte b = 99;                            // 01100011

        byte c = (byte) (b >> 3);		// 00001100	shift right
        System.out.println("c = " + c);

        byte d = (byte) (b ^ c);                 // 01101111	xor
        System.out.println("d =" + d);

        byte e = (byte) (a & d);                 // 00001101	and
        System.out.println("e =" + e);

        byte f = (byte) (b | a);                 // 01111111	or
        System.out.println("f =" + f);

        byte g = (byte) (e << 4);                // 11010000	shift left
        System.out.println("g =" + g);

    }
}
