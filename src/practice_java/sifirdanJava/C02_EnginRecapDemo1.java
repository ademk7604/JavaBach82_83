package practice_java.sifirdanJava;

public class C02_EnginRecapDemo1 {
    public static void main(String[] args) {
        // en büyük sayiyi bulmak
        int sayi1 = 24;
        int sayi2 = 22;
        int sayi3 = 23;
        String EnbuyukSayi;
        if(sayi1<sayi2 && sayi3<sayi2){
            System.out.println("EnbuyukSayi = " + sayi2);
        }else if(sayi2<sayi1 && sayi3<sayi1){
            System.out.println("EnbuyukSayi = " + sayi1);
        }else{
            System.out.println("EnbuyukSayi = " + sayi3);
        }

    }
}
