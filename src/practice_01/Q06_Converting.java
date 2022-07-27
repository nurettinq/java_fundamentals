package practice_01;

import java.util.Scanner;

public class Q06_Converting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen litrre olarak giriniz:");
        double litre= scan.nextDouble();
        System.out.println(litre+"litre "+1/3.785*litre+"galondur");
        System.out.print("fahrenieyt değeririni giriniz:");
        double fahr= scan.nextDouble();
        double c=(fahr-32)*5/9;
        System.out.println(fahr+" fahreniet"+c+" santigrat derece yapar");
    }

}
