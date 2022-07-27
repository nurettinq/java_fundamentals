package day06_free;

import java.util.Scanner;

public class C02_MetreMile {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("gidilecek mesafeyi yazınız:");
            double metre=scan.nextDouble();
            System.out.println("varma süresini yazınız:");
            double hour=scan.nextDouble();
            scan.nextLine();
            double minutes=scan.nextDouble();
            scan.nextLine();
            double seconds=scan.nextDouble();
            System.out.println("your speed in meter/secands:"+metre/((3600*hour)+60*minutes+seconds));
            System.out.println("your speed in km/hour:"+(metre/1000)/(hour+minutes/60+seconds/3600));
            System.out.println("your speed in mile/hour:"+(metre/1609)/(hour+minutes/60+seconds/3600));
    }

}
