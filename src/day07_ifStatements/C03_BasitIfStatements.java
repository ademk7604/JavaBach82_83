package day07_ifStatements;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Bir if statement'da { kullanilmazsa, Java IlK SATIRI SART ile baglar, sonraki satirlar BAGIMSIZ olur.
        Eger BIRDEN FAZLA satir ayni if sartina baglanmis ise mutlaka {} kullanmaliyiz.
        {} parantesi nereyi baglamak istiyorsam oraya koyarim, yoksa sadece ilk satir if e bagli olarak calisir.
         */
        int sayi = -23;
        if (sayi > 0)
            System.out.println("sayi pozitif"); // degere bagli
        System.out.println("pozitif kalacaktir"); // Her zaman calisir
        if (sayi % 2 == 0)
            System.out.println("sayi cift"); // degere bagli
        System.out.println("cift kalacaktir"); // Her zaman calisir
        if (sayi % 5 == 0)
            System.out.println("Sayi 5'in tam kati"); // degere bagli
    }
}
