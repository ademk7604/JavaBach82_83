package day24_arrayList_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        String [] arr= {"Ismail","Nurullah","Fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari List e cevirmek
        daha pratik olabilir
        1- loop ile array deki tum elementleri liste atabiliriz
        2- Arrays.asList() kullanabiliriz
            ancak bu metho dun 2 tane kotu yan etkisi var.
            -Arrays class i kullanildigi icin array ozellikleri gecerli olur
            dolayisiyla list'te olan add, remove gibi size i degistiren method lar
            bu sekilde olusturulan list'lerde kullanilamaz.
            - kaynak olan array ileurun olan list ozdeslestirilir.
            birimde yapilan degisiklik, otomatik olarak digerine de islenir.
         */

        List<String> sinifList = Arrays.asList(arr); // primitive data turlerinin yerine reppelcalasslarini terccih etmemiz lazimdi
        System.out.println(sinifList); //[Ismail, Nurullah, Fatih]

        // 1. yan etki
        //sinifList.add("Erdi"); // itiraz etmiyor ama calistirdigimizda hata veriyor desteklenmeyen operation
        //sinifList.remove(1); // UnsupportedOperationException yine

        //2. yan etki
        arr[1]="Emre";
        System.out.println("degisim sonrasi array : "+ Arrays.toString(arr));
        System.out.println("Array i degiositirince list : "+ sinifList); // array degistirdim listi degil ama burda list de degisti
        sinifList.set(0,"Utku");
        System.out.println("List i degistirince list : "+ sinifList);
        System.out.println("Listi degistirince array : "+ Arrays.toString(arr)); // listi degistirdim array de degisti
    }
}
