package Quiz2;

/**
 * @file Grup1_Soru2.java
 * @date Apr 16, 2018 , 6:59:00 PM
 * @author Muhammet Alkan
 */
public class Grup1_Soru2 {

    public static void main(String[] args) {
        String cumle = "Fatih Sultan Mehmet";

        String[] kelimeler = kelimeleriBul(cumle);

        // bulunan kelimeleri yazdır
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i] != null) {
                System.out.println(kelimeler[i]);
            }
        }
    }

    static String[] kelimeleriBul(String cumle) {
        String kelime = "";

        String[] array = new String[cumle.length()];
        int k = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) != ' ') {
                kelime += cumle.charAt(i);
            } else {
                array[k++] = kelime;
                kelime = "";
            }
        }
        // son kelime için
        array[k] = kelime;

        return array;
    }

    // alternatif çözüm
    static String[] kelimeleriBul2(String cumle) {
        String kelime = "";

        String[] array = new String[cumle.length()];
        int k = 0;

        int lastIndex = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                kelime = (String) cumle.subSequence(lastIndex, i);
                array[k++] = kelime;
                lastIndex = ++i;
            }
        }
        // son kelime için
        array[k] = (String) cumle.subSequence(lastIndex, cumle.length());
        return array;
    }
}
