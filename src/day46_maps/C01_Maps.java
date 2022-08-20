package day46_maps;
import java.util.*;
public class C01_Maps {
    public static <Maps> void main(String[] args) {
        Map<Integer,String> sinifList = new HashMap<>(); // map ile ugrasiyorsak sabirli olmaliyiz

        sinifList.put(101,"Ali, Can, JDev"); // 1 bosluk birakirsan hepsinde ayni yapmalisin. yoksa hepsinde olmasin
        sinifList.put(102,"Enes, Cem, Tester");// binlerce element olabilir. boyle kisa olmazlar
        sinifList.put(103,"Taha, Emre, JDev"); // yapimiz ne kadar komplex olursa mucadelemeiz o kadar cok oluyor.
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}
        System.out.println(sinifList.keySet()); //[101, 102, 103, 104]
        System.out.println(sinifList.values());
        //[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester] // aslinda burda 4 element var.
        System.out.println(sinifList.values().size()); // 4 her bir element icin 3 bilgi getirdi.

        // tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin. // burada gocunup kacinmayacaksiniz,
        Collection<String> tumValueColl=sinifList.values(); // valueleri bir collection a kaydedebiliyoruz. 4 tane stirng ile ugrasacagiz
        String[] eachArr;
        int sira=1;
        for (String each:tumValueColl
             ) {
            // buradaki each  bize her bir ogrenciye ait ayni yapidaki isim, soyisim, brans bilgilerini iceren Stringler getiriyor.
           // System.out.println(each); normal veriyi yazdirir
            eachArr = each.split(", "); // elemanlari , ve bosluk ile siralandigi icin , dedim. elemanlari elde ettim.
            // en iyi yolu olan split methodu ile paracaladim. erray atadik
            System.out.println(sira + "- " + eachArr[0]+ " " + eachArr[1]); //atadigim her elementin 0.i ve 1. degerini aldim
            sira++;
        }
        // Map de bulunan ogrencilerinin isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun. // once list olusturalim
        List<String> sinifIsimSoyisimList = new ArrayList<String>();
        for (String each:tumValueColl // yukarida arry de yaptigim islerler loop da dondu orda bitti. yeniden collection dan urunleri alip islem yapiyoruz.
             ) {
            eachArr=each.split(",");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList); //[Ali  Can, Enes  Cem, Taha  Emre, Derya  Deniz]
        // Biz bu islemleri method uzerinden yapmamiz icin methodu hazirlayalim SUREKLI KULLANALIM.
    }
}
