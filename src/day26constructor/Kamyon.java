package day26constructor;

public class Kamyon {
    public  String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public  int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return "Kamyon" +
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }
}
