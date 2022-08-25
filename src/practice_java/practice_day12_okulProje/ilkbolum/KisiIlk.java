package practice_java.practice_day12_okulProje.ilkbolum;
public class KisiIlk {
    private String adSoyad;
    private String kimlikNo;
    private int yas; // herkesin ortak ozelligi
    public KisiIlk(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public String getKimlikNo() {
        return kimlikNo;
    }
    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) { // yas kontrolu yapiniz
        this.yas = yas;
    }
    public KisiIlk() {
    }
    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
