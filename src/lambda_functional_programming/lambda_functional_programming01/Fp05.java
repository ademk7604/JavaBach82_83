package lambda_functional_programming.lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);
        List<Courses> coursesList = new ArrayList<>(); // yukarda olusturdugum objeleri bir lsite atadim.
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight); // bu sekilde listin icine tum objelerimi koydum.
        // nasil String class bir data typ dir. her bir class da  bir data typ dir.
        //Integer wapper calss oldugu icin default u null dur.

        System.out.println("ortalamaPuanlarVerilenSayidanBuyukMu : "+ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,75)); //true
        System.out.println("herhangiBirKursAdiKelimeyiIceriyorMu: "+herhangiBirKursAdiKelimeyiIceriyorMu(coursesList,"Turkish")); //true
        System.out.println("ortalamasiEnYuksekKursunAdiniYazdir(Courses) = " + ortalamasiEnYuksekKursunAdiniYazdir(coursesList));//Turkish Night
        ortalamasiEnYuksekKursunAdiniYazdir02(coursesList); //Turkish Night
        System.out.println("ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList) = " + ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(coursesList,1));
        // [Course: Season=Spring, courseName=English Day, averageScore=95, numberOfStudents=132, Course: Season=Summer, courseName=Turkish Day,
        // averageScore=97, numberOfStudents=128, Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154]

    }
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses>list, double x){

        return list.stream().allMatch(t->t.getAverageScore()>x);
    }
    //2)Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
    public static boolean herhangiBirKursAdiKelimeyiIceriyorMu(List<Courses> list, String kelime){

        return list.stream().anyMatch(t->t.getCourseName().contains(kelime));
    }
    //3) Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
    public static String ortalamasiEnYuksekKursunAdiniYazdir(List<Courses> list){

       return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
    }
    public static void ortalamasiEnYuksekKursunAdiniYazdir02(List<Courses> list){

        String sonuc = list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();
        //sorted(Comparator.comparing(Courses::getAverageScore).reversed()) ortalama scoreleri siralamak icindir burasi.
        System.out.println(sonuc);
    }
    //4) List öğelerini artan düzende ortalama puana göre sıralayın ve ilk verilenleri atlayın
    public static List<Courses> ortalamaPuanaGoreSiralaVeIlkVerilenleriAtla(List<Courses> list, int x){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(x).collect(Collectors.toList());
        //skip(x) alta komutu
    }
}
