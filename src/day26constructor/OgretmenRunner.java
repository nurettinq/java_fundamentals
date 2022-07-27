package day26constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 = " + ogretmen1.toString());
        Ogretmen ogretmen2 = new Ogretmen("nurettin","güzel","07.01.1994","matematik","resim");
        System.out.println("ogretmen2 = " + ogretmen2.toString());
        Ogretmen ogretmen3 = new Ogretmen("nurullah","güzel","11.04.1996");
        System.out.println("ogretmen3 = " + ogretmen3.toString());




    }
}
