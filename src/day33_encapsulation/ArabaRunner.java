package day33_encapsulation;
public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka veriable' ina
        // ulasabildim, degistirebildim(set(yazma)) ve yazdirabildim(get(okuma))
        arb1.marka="Toyota";
        System.out.println(arb1.marka);
        // access modifiler kullanarak marka variable'ina ulasimi tamamen serbest yapabilir veya tamamen egelleyebiliyorum
        // private yaptigim model e ise hic ulasamiyorum. // model. dedigim zaman gelmiyor
        // yani acess modifiler ya hep ya hic diyor. ya hem ulasir hem degisitirisin yana ne ulasir nede degistirebilirsin
        // modeli'i degistirelim ama goremeyelim, yakiti da gorelim ama degistirmeyelim
        /*set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim ozel yetki tanimlayacaginiz variable"lari private yapin
        // private bir veriable baska class lardan ulasmaya mumkun olmadigindan
        // 2. adim- set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim*/
        arb1.setModel("Corolla"); // model olarak Supra'yi atadik
        // model'i yazdirama imkanimiz yok, cunku getter method u yok
        arb1.getYakit();
        System.out.println(arb1.getYakit()); // elektreikli bilgsini yazdirabildik // Toyota Elektrikli
        // yakiti degistiremeyiz cunku setter method u yok

    }
}
