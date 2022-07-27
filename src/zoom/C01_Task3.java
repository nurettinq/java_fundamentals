package zoom;

import java.util.Scanner;

public class C01_Task3 {
    public static void main(String[] args) {
          /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.
*/
        Scanner scan=new Scanner(System.in);
        String input="";

        while(!input.equalsIgnoreCase("x")) {
            System.out.println("bir harf veya sembol giriniz");
            input = scan.next();
            if(input.equalsIgnoreCase("x"))break;
            System.out.println("program devam ediyor \n");

        }System.out.println("program bitti");






    }


    }

