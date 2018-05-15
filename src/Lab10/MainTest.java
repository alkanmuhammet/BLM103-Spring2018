
package Lab10;

import Lab10.MalTanim.Bilgisayar;
import Lab10.MalTanim.Malzeme;
import Lab10.MalTanim.Yazici;
import Lab10.SatisTanim.Satis;

/**
 * @file MainTest.java
 * @date May 14, 2018 , 4:59:34 PM
 * @author Muhammet Alkan
 */
public class MainTest {
    public static void main(String[] args) {
        Satis s1 = new Satis();
        // malzemeler listesi 5 elemanli
        s1.malzemeler[0] = new Malzeme();
        s1.malzemeler[1] = new Bilgisayar();
        s1.malzemeler[2] = new Yazici();
        s1.malzemeler[3] = new Yazici(3);
        s1.malzemeler[4] = new Malzeme();
        s1.malzemeler[4].adi = "malzeme4";
        s1.malzemeler[4].turu = "sarf";
        
        for (int i = 0; i < s1.malzemeler.length; i++) {
            System.out.println(s1.malzemeler[i]);
        }
    }
}
