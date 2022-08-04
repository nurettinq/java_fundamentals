package day38_exceptions;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("lütfen yaşinizi giriniz");
            Scanner scan = new Scanner(System.in);
            try {
                int yas = scan.nextInt();
                System.out.println("yasiniz" + yas);break;
            } catch (Exception e) {
                System.out.println("böyle yas mi olur");
            }
        }
    }}
