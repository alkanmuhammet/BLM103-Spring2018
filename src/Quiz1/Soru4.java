package Quiz1;

/**
 * @file Soru4.java
 * @date Apr 7, 2018 , 1:23:57 PM
 * @author Muhammet Alkan
 */
public class Soru4 {

    public static void ucgenKontrol(int kenar1, int kenar2, int kenar3) {
        int kenarKontrol = 0;

        if (kenar1 > Math.abs(kenar2 - kenar3) && kenar1 < (kenar2 + kenar3)) {
            kenarKontrol++;
        }
        if (kenar2 > Math.abs(kenar1 - kenar3) && kenar2 < (kenar1 + kenar3)) {
            kenarKontrol++;
        }
        if (kenar3 > Math.abs(kenar1 - kenar2) && kenar3 < (kenar1 + kenar2)) {
            kenarKontrol++;
        }

        if (kenarKontrol == 3) {
            System.out.println("Verilen kenarlarla üçgen oluşabilir, kurallar sağlanıyor.");
            System.out.print("Oluşan üçgenin tipi: ");
            
            if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 == kenar3) {
                System.out.println("Eşkenar üçgen");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("İkizkenar üçgen");
            } else {
                System.out.println("Çeşitkenar üçgen");

            }
        } else {
            System.out.println("Verilen kenarlarla üçgen oluşamaz, kurallar sağlanmıyor.");
        }
    }

    // test
    public static void main(String[] args) {
        System.out.println("3 4 5 üçgeni : ");
        ucgenKontrol(3, 4, 5);
        
        System.out.println("\n4 5 5 üçgeni : ");
        ucgenKontrol(4, 5, 5);
        
        System.out.println("\n5 5 5 üçgeni : ");
        ucgenKontrol(5, 5, 5);
        
        System.out.println("\n5 5 25 üçgeni : ");
        ucgenKontrol(5, 5, 25);
    }
}
