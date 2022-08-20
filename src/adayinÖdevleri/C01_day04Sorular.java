package adayinÖdevleri;

public class C01_day04Sorular {
    public static void main(String[] args) {
        //Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin
        byte sayi10= 40;
        short sayi11= (short) (sayi10+50);
        System.out.println(sayi11);
        int sayi12= sayi11+5000;
        float sayi13= sayi12+2333;
        double sayi14= sayi13+sayi12;
        System.out.println(sayi13);
        System.out.println(sayi14);
        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        int a= 200;
        short b= (short) a;
        System.out.println(a);
        System.out.println(b);
        byte c= (byte) b;
        System.out.println(c);
        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        float sayi= 1.23f;
        System.out.println(sayi);
        //Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip
        //yazdirin
        double sayi1= 255.36;
        int sayi2= (int) sayi1;
        byte sayi3= (byte) sayi2;
        System.out.println(sayi3);
        //Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int x= 20;
        int y=30;
        x=y;
        System.out.println(x);
        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int sayi4= 20;
        double sayi5= 30.3;
        System.out.println(sayi4/sayi5);
        // Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        int sayi6= 700;
        double sayi7= 44.5;
        sayi7=sayi6;
        System.out.println(sayi7);


    }
}
