package day08_ifstatement;

import java.util.Scanner;

public class C01_IfElseIfStatement {
    public static void main(String[] args) {
        //kullanıcıdan gün ismi alın geçerli ise günün 1-2-3. harflerini büyük diğerlerini küçük yazin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        }
        else if (gun.equals("salı")){
            System.out.println("Sal");
        }
        else if (gun.equals("çarşamba")){
            System.out.println("Çar");
        }
        else if (gun.equals("perşembe")){
            System.out.println("Per");
        }
        else if (gun.equals("cuma")){
            System.out.println("Cum");
        }
        else if (gun.equals("cumartesi")){
            System.out.println("Cum");
        } else if (gun.equals("pazar")){
            System.out.println("Paz");
        }
        else {
            System.out.println("lütfen geçerli bir gün giriniz");
        }
    }
}
