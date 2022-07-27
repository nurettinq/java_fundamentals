package day26constructor;


import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.fiyat);
        Araba araba1 = new Araba();
        araba1.fiyat = 1000;
        araba1.marka = "bmv";
        araba1.yil = 2022;
        araba1.model = "3.20";
        System.out.println("araba bilgileri\nMarka : " + araba1.marka + "\nModel : " + araba1.model
                + "\nYil : " + araba1.yil + "\nFiyat : " + araba1.fiyat);
        Araba araba2 = new Araba("audi", "a3", 2022, 25000);
        System.out.println("araba2 bilgileri\nMarka : " + araba2.marka + "\nModel : " + araba2.model
                + "\nYil : " + araba2.yil + "\nFiyat : " + araba2.fiyat);
        Araba araba3 = new Araba("opel","astra",2015,26000);
        System.out.println("araba3 bilgileri\nMarka : " + araba3.marka + "\nModel : " + araba3.model
                + "\nYil : " + araba3.yil + "\nFiyat : " + araba3.fiyat);



    }
}