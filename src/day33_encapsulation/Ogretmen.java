package day33_encapsulation;
public class Ogretmen {
    private String isim;
    private String soyisim;
    private String brans;
    /*
    Bazen de yetkileri sinirlandirmak degilde yapin isi daha iyi tanimlamak icin encapsulation kullanilabilir
    Bu yaklasimi kullanan class larda tum verable lar private yapilip hepsi icin getter ve setter olusturulur
     */
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyisim() {
        return soyisim;
    }
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    public String getBrans() {
        return brans;
    }
    public void setBrans(String brans) {
        this.brans = brans;
    }
}
