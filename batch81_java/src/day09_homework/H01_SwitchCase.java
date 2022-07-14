package day09_homework;

import java.util.Scanner;

public class H01_SwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen SDET hasrflerinden birini giriinz");
        char harf=scan.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'S':
                System.out.println("Software");
                break;

            case 'D':
                System.out.println("Devolopment");
                break;

            case 'E' :
                System.out.println("Engineering");
                break;

            case 'T':
                System.out.println("In Testing");
                break;

        default :
            System.out.println("geçerli bir giriş yapınız");

        }
    }
}
