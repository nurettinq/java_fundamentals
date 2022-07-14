package day13_recap;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line
        Scanner scan=new Scanner(System.in);
        System.out.println("isminiz: ");
        String isim=scan.nextLine();
        System.out.println("memleketiniz :");
        String memleketiniz=scan.nextLine();
        System.out.println("şuanki konumunuz :");
        String konumunuz=scan.nextLine();
        System.out.println("yaşınızı :");
        int yas=scan.nextInt();
        System.out.println("boyunuz :");
        double boy=scan.nextDouble();
        System.out.println("yaşadıgınız"+konumunuz+"seviyor musunuz? true/false");
        boolean  seviyorMu=scan.nextBoolean();
        System.out.println("isim = " + isim);
        System.out.println("memleketiniz = " + memleketiniz);
        System.out.println("konumunuz = " + konumunuz);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);




    }


}
