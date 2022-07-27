package day17_forloop;

public class C09_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu=false;
        int sayi=20;
        while(!dogruMu) {
            if(sayi>=30){
                System.out.println("bu işlem tamam");
                dogruMu=true;
            }else{
                System.out.println("30 olana kadar devam et"+sayi);
                sayi++;
            }
        }

            }
}
