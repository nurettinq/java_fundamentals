package day07_ifstatement;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karaker girinz");
        char harf=scan.next().charAt(0);
        if ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("bu bir harftir");

        } else{
            System.out.println("bu bir harf değildir");
        }
    }
}
