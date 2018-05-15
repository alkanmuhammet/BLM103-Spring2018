package Lab10.SatisTanim;

// Malzeme sınıfı public olmalı
import Lab10.MalTanim.Malzeme;

/**
 * @file Satis.java
 * @date May 14, 2018 , 4:43:52 PM
 * @author Muhammet Alkan
 */
public class Satis {

    // int[] dizi tanımlar gibi Malzeme dizisi tanımlayabiliriz
    // 5 elemanlık bir dizi oluşturduk, dizini her elemanı bir Malzeme nesnesi
    public Malzeme[] malzemeler = new Malzeme[5];

    public int adet;
    public int fiyat;
    
    // parametre olarak alınan Malzeme m listede varmı diye kontrol ediyoruz
    boolean malzemeVarmi(Malzeme m) {
        for (int i = 0; i < malzemeler.length; i++) {
            if (m == malzemeler[i]) {
                return true;
            }
        }

        // liste dolaşılırken true dönmediysek malzeme yok demektir.
        return false;
    }
}
