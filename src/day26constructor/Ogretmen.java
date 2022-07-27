package day26constructor;

public class Ogretmen {
    String isim="isim belirtilmedi";
    String soisim="soyisim belirtilmedi";
    String dogumTarihi="tarih belirtilmedi";
    String brans="branş belirtilmedi";
    String yanBrans="branş belirtilmedi";

    public Ogretmen(String isim, String soisim, String doğumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soisim = soisim;
        this.dogumTarihi = doğumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soisim, String doğumTarihi) {
        this.isim = isim;
        this.soisim = soisim;
        this.dogumTarihi = doğumTarihi;
    }

    @Override
    public String toString() {
        return   "\nisim=" + isim +
                "\nsoisim=" + soisim +
                "\ndogumTarihi=" + dogumTarihi +
                "\nbrans=" + brans +
                "\nyanBrans='" + yanBrans;
    }

    public Ogretmen() {
    }
}
