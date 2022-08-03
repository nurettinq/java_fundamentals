package day38_exceptions;

public class C01_Exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("payda 0 oldu dkkk atli ol");
        }
    }
}
