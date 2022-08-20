package day33_encapsulation;
public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1 = new Ogretmen();
        ogr1.setIsim("Tulay"); // bu kodu okuyan isim veriable tulay olarak set edilmis
        System.out.println(ogr1.getIsim()); // bu kodu okuyan isim veriable get edilmistir diye anliyor
        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmistir olur
         */

    }
}
