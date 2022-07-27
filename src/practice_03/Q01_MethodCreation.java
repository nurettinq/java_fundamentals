package practice_03;

import java.util.Scanner;

public class Q01_MethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("birkelime giriniz");
        String kelime=scan.nextLine().toLowerCase();
        xyzVarMi(kelime);
        System.out.println(xyzVarMi(kelime));
    }

    public static boolean xyzVarMi(String kelime) {
        if (kelime.contains("xyz")){
            return true;
        }else {
            return false;
        }
    }


}
