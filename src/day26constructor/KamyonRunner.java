package day26constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 in ozellıklerı "+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("mercedes","4140",2017,39000);
        System.out.println("kamyon 2 bilgileri "+kamyon2.toString());
        Kamyon kamyon3=new Kamyon("scania","s540");
        System.out.println("kamyon3 bilgileri "+kamyon3.toString());
    }

}
