package day13_recap;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        /*Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen iş unvanınızı giriniz");
        String jobTitle=scan.nextLine().toLowerCase();
        if(jobTitle.equals("qa")){
            System.out.println("Quality Analist");
        }else if(jobTitle.equals("dev")){
            System.out.println("devoloper");
        }else if(jobTitle.equals("ba")){
            System.out.println("business analist");
        }else if(jobTitle.equals("pm")){
            System.out.println("product manager");
        }
    }
}
