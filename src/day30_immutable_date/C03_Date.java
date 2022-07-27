package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.isLeapYear());
        LocalDate tarih2=LocalDate.of(1994,1,7);
        System.out.println(tarih2);
        LocalDate tarih3=LocalDate.of(2022, Month.JANUARY,27);
        System.out.println(tarih3);
        System.out.println(tarih.plusDays(10));
        System.out.println(tarih.plusYears(2).plusMonths(5));
        System.out.println(tarih.minusDays(150));
        System.out.println(tarih.isAfter(tarih2));
        if(tarih.isBefore(tarih3)){
            System.out.println(tarih+" büyük");
        }else if(tarih.isAfter(tarih3)){
            System.out.println(tarih3+" büyük");
        }else System.out.println("eşit");
    }
}
