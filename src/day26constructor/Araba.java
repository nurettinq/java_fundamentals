package day26constructor;

public class Araba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil;
    int fiyat;

    public Araba(String markaR, String modelR, int yılR, int fiyatR) {
    marka=markaR;
    model=modelR;
    yil=yılR;
    fiyat=fiyatR;
    }
    public Araba(){

    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar" );
    }
}
