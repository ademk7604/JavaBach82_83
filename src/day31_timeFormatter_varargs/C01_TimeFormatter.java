package day31_timeFormatter_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : " + tarihSaat);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm"); // buyuk harfle M ay kucuk m minnut

        System.out.println(dtf1.format(tarihSaat)); // 25/7/22 08:49

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm"); // buyuk harfle M ay kucuk m minnut
        // M kacinci ay YY 07 diye.
        System.out.println(dtf2.format(tarihSaat)); // 25/Tem/2022 20:46
        // ama atama yapamiyoruz bir tarafi string digeri tarih. bunlari ezberlemek zorunda degiliz.
    }
}
