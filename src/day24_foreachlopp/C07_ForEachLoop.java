package day24_foreachlopp;

public class C07_ForEachLoop {
    public static void main(String[] args) {
        int[]sayilar={2,43,46,85,7,8,56,4,6};
        int toplam=0;
        for(int each:sayilar){
            toplam+=each*each;
        }
        System.out.println("kareler toplamı "+toplam);
}}
