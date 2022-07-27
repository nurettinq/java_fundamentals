package day07_ifstatement;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0&&b<20&&c>=b);
        System.out.println(a<0&&b<20&&c>=b); // çift && işaretinde ilk false a kadar yapar diğerlerine bakmaz.
        System.out.println(a<0&b<20&c>=b);  //tek & işaretinde tüm operatorler kontrol eder.
    }
}
