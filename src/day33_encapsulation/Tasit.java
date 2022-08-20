package day33_encapsulation;
public class Tasit {
   private String tasitTuru;
   private boolean muayenesiVArMi;
   private int yil;
    public String getTasitTuru() {
        return tasitTuru;
    }
    // getter method u da tek bir satirlik islem yapiyor baska class larin private oldugu icin erisemedigi
    //tasitTuru bilgisini, class icinden alip istenen farkli class lar return ediyor.
    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
        // gonderdigimiz tir i tasitTurune this. ile de String tasitTuru veriablene atma yapiyoruz.
        // return olmadigi icin bu methodun cagrildigi Tasit Runner Classinda yazdirilamaz
        // 1 satirlik islem var. gonderdigimiz argumenti istance a atrma detzit:)
    }
    public boolean isMuayenesiVArMi() {
        return muayenesiVArMi;
    }
    // boolean variable'lar icin olusturulan getter methodlarin ismi isVerableIsmi seklinde olur
    public void setMuayenesiVArMi(boolean muayenesiVArMi) {
        this.muayenesiVArMi = muayenesiVArMi;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        this.yil = yil;
    }
}
