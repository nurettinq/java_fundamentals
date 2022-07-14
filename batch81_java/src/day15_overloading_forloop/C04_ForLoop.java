package day15_overloading_forloop;

public class C04_ForLoop {
    public static void main(String[] args) {
        // 1den 5 e kadar olan sayıların toplamını yazdırın
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;

        }
        System.out.println("toplam = " + toplam);
        // 10 dan 20ye kadar sayıları toplayalım
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;


        }
        System.out.println("toplam = " + toplam);;
        //30dan 50 ye kadar çiftsayılar toplamı
        for (int i = 30; i <=50 ; i++) {
            if(i%2==0){
                toplam+=i;
            }




        }
        System.out.println("toplam = " + toplam);
        // 1600 ile 1700 arasında 7 ye bölünen sayıların toplamı
        for (int i =1600; i <1700 ; i++) {
            if(i%7==0){
                toplam+=i;
            }

        }
        System.out.println("toplam = " + toplam);
    }
}
