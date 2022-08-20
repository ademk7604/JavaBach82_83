package recap2;

public class Q09_ForWhileSayi {
    public static void main(String[] args) {
        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
Input :1238
Output :Girilen Numananin Tersi: 8321
         */
        int sayi=1238;
        int sonucSayi;
        while (sayi>0){
            System.out.print(sayi%10);
            sayi/=10;
        }

    }
}
