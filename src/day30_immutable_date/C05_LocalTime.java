package day30_immutable_date;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        /* bizim oluşturduğumuz date ve time canlı  değildir
        localTime.now();kullandığımız

         */
        Thread.sleep(3000);
        time=LocalTime.now();
        System.out.println(time);
    }
}
