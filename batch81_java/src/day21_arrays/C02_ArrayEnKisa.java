package day21_arrays;

public class C02_ArrayEnKisa {
    public static void main(String[] args) {

        String[] isimler ={"nuri","nurettin","nurullah"};
        enUzunVeKisayiYazdir(isimler);
    }

    private static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzun=isimler[0];
        String enKisa=isimler[0];
        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length() >= enUzun.length()){
                enUzun=isimler[i];
            }
            if (isimler[i].length() < enKisa.length()){
                enKisa=isimler[i];
            }

        }
        System.out.println("arraydaki en uzun kelime " + enUzun+"\n arraydaki en kisa isim "+ enKisa);
    }
}
