package sifirdanJava;

public class C01_EnginConditioneals {
    public static void main(String[] args) {
        int sayi = 20; //else= diger tüm sartlar demektir. else durumu varsa prog mutlaka bir sonuc döndürecegin biliyrz
        if (sayi < 20) {
            System.out.println("sayi 20 den kucuktur");
        } else if(sayi==20){ //
            System.out.println("sayi 20 ye esittir.");
        }else{
            System.out.println("sayi 20 den buyuktur");
        }
        //if else if else durumunda uygulamanin kacabilecegi bir tarafi yoktur. büytün sartlar  gozönunde bulundurulur.
    }
}
