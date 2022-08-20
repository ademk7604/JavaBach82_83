package practice_day12_okulProje;
public class Ogrenci extends Kisi { // const control edilecek
    private String ogrencuNo;
    private String sinif;
    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrencuNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrencuNo = ogrencuNo;
        this.sinif = sinif;
    }
    public Ogrenci(){
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
