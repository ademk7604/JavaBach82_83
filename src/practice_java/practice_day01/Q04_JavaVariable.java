package practice_java.practice_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {
        // Initializing Variable  //variable baslangic degeri verme
        int yas = 33;
        double boy = 1.70;
        System.out.println("yas :" + yas);
        // To copy the variable's value
        int yasim = 33;
        int enesyas = yasim;
        System.out.println("enesyas = " + enesyas);
        System.out.println("yasim = " + yasim);


        // you can declare multiple variables in the same line
        int yil = 2022, ay = 6, gun = 20; //, ile coklu tanimlama yapabilirim.
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        // updating a variable
        yil = 2032;
        System.out.println("update yil = " + yil);



        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize edin
        //y degiskenini yeni bir degerle guncelleyin

        int x; // deklarasyon
        int y=2000; // initilaze - asingnment
        x=30; //ilk degerini verevek intialaze ettik
        y=1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
