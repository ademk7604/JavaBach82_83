package practice_java.practice_day12_okulProje.ilkbolum;

public class OgretmenIlk extends KisiIlk {
    private String bolum;
    private String sicilNo;
    public OgretmenIlk() {
    }
    public OgretmenIlk(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    public String getBolum() {
        return bolum;
    }
    public String getSicilNo() {
        return sicilNo;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}'+super.toString(); // ad soyad kisimini gelsemi icin
    }
}
