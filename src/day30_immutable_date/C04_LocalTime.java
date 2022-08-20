package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now(); // atama yaptigimiz icin artik degismez
        System.out.println(time1); // 18:12:22.507392600
        /* Bizim olusturdugumuz date ve time canli saat veya tarih degildir.
        localTime.no2(); kullandigimiz satirda o anki tarih ve saati alip
        bizim veriable mize store eder.
        time1 variable inin degeri sabittir.
         */
        Thread.sleep(3000);// 3 saniye bekler
        time1=LocalTime.now();
        System.out.println(time1); //

        System.out.println(time1.getSecond()); // 32
        System.out.println(time1.plusSeconds(10000)); // 21:18:12.631502800
        System.out.println(time1.minusMinutes(200)); // 15:13:59.829050300
        System.out.println(time1.withHour(3)); // saati 3 yapip yazdirdi
    }
}