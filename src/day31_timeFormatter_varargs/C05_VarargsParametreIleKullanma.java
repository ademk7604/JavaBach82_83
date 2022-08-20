package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali", "Ayse", "Ismail", "Babayigit","Akin");//bunun yanina kac tane yazarsam hepsini alir.
    }
    // java herzaman argumentlerle parametreleri kontrol eder yukari argument asgisi parametre.5 int kelimesayisina, stringler
    /*
    Varargs teorig olarak sonsuz sayida element alabilir. Bir method da parametre olarak varargs varsa
    varargs in sinirlarini bilenilmesi icin parametrelerin sonuncusu olmalidir.
    oncesinde farkli parametreler olabilir ama varargs tan sonra parametre OLAMAZ

    Bu kuraldan oturu bir method da sadece bir tane varargs olabilir. */
    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) { // basina 5 yazdigimda sorun ortadan kaldkti

        String enUzunKelime=kelime[0];
        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu : "+ enUzunKelime);
    }
}

