package practice_java.practice_day12_okulProje.ilkbolum;

public class OgrenciIlk extends KisiIlk { // const control edilecek
    private String ogrencuNo;
    private String sinif;
    public OgrenciIlk(String adSoyad, String kimlikNo, int yas, String ogrencuNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrencuNo = ogrencuNo;
        this.sinif = sinif;
    }
    public OgrenciIlk(){
    }
    public String getOgrencuNo() {
        return ogrencuNo;
    }
    public void setOgrencuNo(String ogrencuNo) {
        this.ogrencuNo = ogrencuNo;
    }
    public String getSinif() {
        return sinif;
    }
    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrencuNo='" + ogrencuNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}'+super.toString(); // kisilerdeki bilgileri getirsin diye
    }
}
