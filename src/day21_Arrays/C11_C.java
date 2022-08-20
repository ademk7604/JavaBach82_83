package day21_Arrays;

import java.util.Scanner;

public class C11_C {
    // soru 3- Kullanicidan aldiginiz bir ismin, verilen array'de olup olmadigini kontrol edip,
    //bize true veya false sonucu donduren bir method olusturun.
    public static void main(String[] args) {
        String[] arr={"Adem","Ayten","Jonas","kok","Tankilic"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aradiginiz ismi giriniz");
      String arananIsim=scanner.nextLine();
      boolean sonuc=contains(arr,arananIsim);
      if (sonuc){
          System.out.println("Aradiginiz ismi bulunmaktadir");
      }else{
          System.out.println("Aradiginiz isim bulunmamaktadir");
      }
    }
    public static boolean contains(String[] isimler, String arananIsim){
        boolean methodSonuc=false;
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                methodSonuc=true;
            }
        }
    return methodSonuc;
    }
}
