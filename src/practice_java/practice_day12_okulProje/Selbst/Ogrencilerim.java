package practice_java.practice_day12_okulProje.Selbst;

public class Ogrencilerim extends Kisilerim {
    private String sinif;
    private int numara;

    public Ogrencilerim(){
           }

    public Ogrencilerim(String adSoyad, String kimlikNo, int yas, String sinif, int numara) {
        super(adSoyad, kimlikNo, yas);
        this.sinif = sinif;
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public int getNumara() {
        return numara;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrencilerim{" +
                "sinif='" + sinif + '\'' +
                ", numara=" + numara +
                '}'+super.toString();
    }
}
