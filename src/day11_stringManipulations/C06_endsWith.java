package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
       /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        String print= "fatih@gmail.com";

        if(!print.contains("@gamil.com")) {
            System.out.println("lutfen gmail adresi giriniz");
        } else if (print.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else{
            System.out.println("lutfen Email adresinizi kontrol edin");
        }
    }
}
