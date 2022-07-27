package day4_Odev;

public class C01_AutoWidening {
    public static void main(String[] args) {
        byte num=127;
        short num2=num;
        int num3=num2;
        long num4=num3;
        float num5=num4;
        double num6=num5;
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
