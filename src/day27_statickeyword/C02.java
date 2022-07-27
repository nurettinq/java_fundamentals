package day27_statickeyword;

public class C02 {
    static int sayi=10;
    int rakam =5;

    public static void main(String[] args) {
        /* class levelda iki tür varable olusturabiliriz
        static (class) variable;
        instance (obje) variable;
        static variable lar tum class tan kullanabiliirken
        instance olanlar static olmayan  mathodlarda kullanılabilir
        instance variasble lara static methoddan ulaşmak istersek
         obje oluşturmamız gerekir
         */
        C02 obje1=new C02();
        System.out.println("obje1 in rakam degeri :"+obje1.rakam);
        System.out.println("objenin sayi degeri :"+sayi);
        obje1.rakam+=1;
        sayi+=1;


        System.out.println("bir artırdıktan sonra obje1 in rakam degeri :"+obje1.rakam);
        System.out.println("bir artirildıktan sonra obje 1 in sayi degeri :"+sayi);
        C02 obje2 = new C02();
        System.out.println("obje2 in rakam degeri :"+obje2.rakam);
        System.out.println("obje2nin sayi degeri :"+sayi);
        obje2.rakam+=1;
        obje2.sayi+=1;
        System.out.println("bir artırdıktan sonra obje2 in rakam degeri :"+obje2.rakam);
        System.out.println("bir artirildıktan sonra obje 2  in sayi degeri :"+sayi);


    }

}
