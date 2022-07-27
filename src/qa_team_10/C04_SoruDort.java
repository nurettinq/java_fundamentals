package qa_team_10;

import java.util.Scanner;

public class C04_SoruDort {
    public static void main(String[] args) {
        // kullanıcıdan üçgenin üç kenarını alın
        // üç kenarda birbirinem eşitse "eşkenar üçgen"
        // ikisi eşitse "ikizkenar üçgen" değilse "çeşitkenar üçgen" yazdırın
        Scanner scanner = new Scanner(System.in);
        System.out.println("üçgenin kenarlarını aralarda entera basarak giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();
        if(kenar1==kenar2&&kenar2==kenar3){
            System.out.println("girdiğiniz ölçüler eşkenar üçgen belirtir");

        }else if(kenar1==kenar2||kenar2==kenar3||kenar3==kenar1){
            System.out.println("girdiginiz ölçüler ikizkenar üçgen belirtir");
        }else{
            System.out.println("girdiginiz ölçüler çeşitkenar üçgen belirtir");
        }
    }

}
