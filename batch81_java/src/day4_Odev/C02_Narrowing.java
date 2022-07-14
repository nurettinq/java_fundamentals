package day4_Odev;

public class C02_Narrowing {
    public static void main(String[] args) {
        int num=450;
        short num2=(short)(num);
        byte num3=(byte)num2;
        System.out.println(num2);
        System.out.println(num3);

    }
}
