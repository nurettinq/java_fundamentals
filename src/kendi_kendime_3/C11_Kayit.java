package kendi_kendime_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Kayit {
   static Scanner scan = new Scanner(System.in);
   static List<String> doktorKayit=new ArrayList<>();
    static boolean ekKayitMi=false;
    public static void main(String[] args) {

        kayitekle(doktorKayit);
        System.out.println(doktorKayit);
    }

    private static String kayitekle(List<String> doktorKayit) {
        String isim="";
        Scanner scan2=new Scanner(System.in);
        do {
               System.out.println("adınız");
            isim = scan2.nextLine();
            doktorKayit.add(isim);
            System.out.println("ek kayit istiyor musunuz\n1-evet\n2-hayır");
            int i=scan.nextInt();
            if(i!=1){
                ekKayitMi=true;
            }
        }while(!ekKayitMi);
        return isim;
    }}
