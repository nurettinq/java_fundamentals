package day13_recap;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
       /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iş unvanınnınzı giriniz");
        String jobTitle=scan.nextLine().toLowerCase();
        switch(jobTitle){
            case "qa":
                System.out.println("quality analist");
                break;
            case "dev":
                System.out.println("devoloper");
                break;
            case "ba":
                System.out.println("business analist");
                break;
            case "pm":
                System.out.println("product manager");
                break;
             default:
                 System.out.println("yanlış formatta job title girdiniz...!");
                break;
        }
    }
}
