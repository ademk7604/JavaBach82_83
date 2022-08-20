package day33_encapsulation;
public class TasitRunner {
    public static void main(String[] args) {
        Tasit tst1=new Tasit();
        tst1.setTasitTuru("Tir");
        tst1.getTasitTuru();
        System.out.println(tst1.getTasitTuru()); //method call

    }
}
