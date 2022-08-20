package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now(); // new keyword u ile yeni kod almana musade etmiyorsa kodu yaz . cozum verir
        // bazen new keyword ile olustururken bazen de yukardaki gibi bir method uzerunden olusturabiliriz.

        System.out.println(tarih); // 2022-07-23
        System.out.println(tarih.getDayOfYear()); // 204
        System.out.println(tarih.getDayOfWeek()); // SATURDAY
        System.out.println(tarih.getMonthValue()); // 7
        System.out.println(tarih.isLeapYear()); // false bu yil artik yil mi degilmi onu veriyor
        LocalDate tarih2 = LocalDate.of(1990,1,1); // 1 degilde 01 yazsaydin ortalik karisir
        System.out.println(tarih2);
        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3);
        System.out.println(tarih.plusDays(100)); //2022-10-31 100 gun sonraki tarih
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); //2027-11-04
        System.out.println(tarih.minusWeeks(20)); //2022-03-05 20 hafta once tarih
        System.out.println(tarih.minusDays(100).minusMonths(5)); //2021-11-14
        System.out.println(tarih.isAfter(tarih2)); // true bizim  tarih digerinden sonrami
        // buyuk data da calistiginizda su sundan sonra ise felan cok ihtiyac olacak
        // iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz.
        // tarih2 ve tarih3 icin bunun yapalim
        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk");
        } else if(tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha buyuk");
        } else{
            System.out.println("iki tarih birbiri ile ayni");
        }
    }
}

