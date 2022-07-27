package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        double indirimiliFiyati=indirimliFiyatHesaplsa(satisFiyati);
        System.out.println("indirimiliFiyati = " + indirimiliFiyati);
        System.out.println("indirimiliFiyati = " + indirimiliFiyati);
    }

    private static double indirimliFiyatHesaplsa(double satisFiyati) {
        double indirimiliFiyati=satisFiyati*0.75;
        return indirimiliFiyati;
    }
}
