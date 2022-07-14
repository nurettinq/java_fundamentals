package day16_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {
          //verilen pozitif bir sayinin pozitif bölenlerini yazdırın
    int sayi=20;
        for (int i = 1; i <=20; i++) {
            if(sayi%i==0){
                System.out.print(i+",");
            }

        }
    }

}
