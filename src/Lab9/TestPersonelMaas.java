package Lab9;

public class TestPersonelMaas {

    public static void main(String[] args) {
        Maas m = new Maas(5000, 1000);
        //m.netOdeme=5000;
        //m.komisyon = 1000;

        Personel p = new Personel();
        p.setMaas(m);

        System.out.println("Personelin maaşı : " + (p.getMaas().getKomisyon() + p.getMaas().getNetOdeme()));

        System.out.println("Personelin maaşı : " + p.getMaas().findTotalSalary());

        p.increaseSalary(m);
        System.out.println("Personelin zamlı maaşı : " + p.getMaas().findTotalSalary());

        Idari i1 = new Idari();
        i1.setMaas(m);

        System.out.println("Idari personelin maaşı : " + i1.getMaas().findTotalSalary());
        i1.increaseSalary(m);

        System.out.println("Idari personelin zamlı maaşı : " + i1.getMaas().findTotalSalary());

    }

}
