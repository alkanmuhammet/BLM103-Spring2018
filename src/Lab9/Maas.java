package Lab9;

public class Maas {

    private int netOdeme;
    private int komisyon;

    public Maas() {
    }

    public Maas(int netOdeme, int komisyon) {
        this.netOdeme = netOdeme;
        this.komisyon = komisyon;
    }

    public int getNetOdeme() {
        return netOdeme;
    }

    public void setNetOdeme(int netOdeme) {
        this.netOdeme = netOdeme;
    }

    public int getKomisyon() {
        return komisyon;
    }

    public void setKomisyon(int komisyon) {
        this.komisyon = komisyon;
    }

    int findTotalSalary() {
        return netOdeme + komisyon;
    }
}
