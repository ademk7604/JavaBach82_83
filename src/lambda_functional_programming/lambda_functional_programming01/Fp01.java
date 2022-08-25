package lambda_functional_programming.lambda_functional_programming01;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
       1) Lambda (Functional programming) java 8 ile kullanilmaya baslanmistir. ne yapacagimzi uzerinde duruyor
       2) Functional programming'de "Ne yapilacak" (What to do) uzerine yogunlasir.
          Structured Programming "Nasil yapilacak" uzerine yogunlasir. (How to do) uzerine yogunalsir.(yapilandirilmis p.)
       3) Functional programming Arrays ve Collections ile kullanilir.(baska yerde de kullaniliyormus sonra anlatacak)
       4) "entrySet() methodu ile MAp, Set'e donusturulerek Functional programming 'de kullanilabilir. */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirStructured(liste);
        System.out.println(); // araya attik alt satira gotursun diye
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemeanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional:");
        ciftElemeanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsızTekElemanlarinKupunuYazdir(liste);
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        System.out.println();
        getMaxEleman(liste);
        getMaxEleman02(liste);
        getlistElemanlariArasindaEnKucukDeger(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSrilamaylaTekrarsizElemanlarinYarisi(liste);
    }

    //1) Ardışık(arka arkaya) list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured (List<Integer> list){ //void demek, rtern type yok demek bir seyi yazdiracagiz.
        for (Integer w:list){
            System.out.print(w+" ");
        }
    }

    //1) Ardışık(arka arkaya) list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));// t-> lambda expression diye adlandirilir
        // Stream() methodu collection dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir.
        // t sadece bir sembol ama genelde t kullanilir. degiskenlerin yerine geciyor(8, 9, ...)
        // stream() in isletvi: verileri tek tek alarak forEach loop da kullanilabilecek hale getiriyor. forEach loop kullanabilmem icin stream i kullanamm lazim
    }

    //2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemeanlariYazdirStructured(List<Integer> list){
        for (Integer w:list){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //2) çift sayi olan cift list  elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void ciftElemeanlariYazdirFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); // filter e stream siz kullanamiyoruz 8 10 10 2 8
        // lamda da bir method varsa kullan gitsin kendini yormaya ferek yok. mumkunse kullan bazen for da karmasik oluyor kullanmayabilirsiniz
    }

    //3) Ard arda  tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" ")); // [8, 9, 131, 10, 9, 10, 2, 8] 81 17161 81
    // Eger elemanlarin degerleri degisecekse map () methodu kullanilir.
    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsızTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); //[8, 9, 131, 10, 9, 10, 2, 8] 729 2248091 (belirgin)
        //distinct(); tekrar eden elemanlari eleyen methoddur. en basa aldim ki once filtrelesin diye.
    }
    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
      Integer toplam = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u); // tek bir sayiya donusturduk (indirgeme) // toplamda 0 kullaniyoruz.
        // Wapper class kulllanmak daha mantik li list de int da olur ama bazen problem verebiliyor. (Integer)
        System.out.println(toplam); //168 t= ilk gelen deger 64, u= ikici gelen deger 100 yani sonuc yeni:t=164 u=4 ve son t=168
        // stream i method kullanmak icin kullaniyoruz. // 0 i yani birinci degeri silip sonuna get() ilede calisir.
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun
    public static void  tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){
        Integer carpim = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim); //[8, 10, 2,] //4096000  reduce cok elemani tek elemana dusuruyorum
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1.yol:
    public static void getMaxEleman(List<Integer> list) {
      Integer max =  list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u) -> t>u ? t : u); // veya listimin icinden bir sayi koyabilirim
        System.out.println(max); // t baslangic value su. u ise, list ten gelen degerdir. //131
    }
    //2.yol:
    public static void getMaxEleman02(List<Integer> list) {
      Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u); // kucukten buyuge siralandigi icin biz hep u yu verir.
        System.out.println("max = " + max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    public static void getlistElemanlariArasindaEnKucukDeger (List<Integer> list){
       Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("min = " + min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1.yol
    public static void getYedidenBuyukCiftMin(List<Integer> list){
        Integer min = list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t : u);
        System.out.println(min);
    }
    //2.yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list){
       Integer min = list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min); //sorted(Comparator.reverseOrder()) tersten siralama yapar. buyukten kucuge
        //
    }
    //3.yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list){
        Integer min3 = list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println("min = " + min3);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void getTersSrilamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
      List<Double> sonuc =  list.stream().distinct().filter(t-> t>5).map(t ->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());// sayiyi daouble bolersem double olarak hesaplar
        System.out.println("sonuc = " + sonuc); //sonuc = [65.5, 5.0, 4.5, 4.0]
        // collect(Collectors.toList()) degerleri listin icine toplayacak. list den getirdik tekar liste koyduk. bu sekilde bir List<Double> atadik
    }
}
