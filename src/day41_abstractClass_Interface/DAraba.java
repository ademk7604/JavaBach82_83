package day41_abstractClass_Interface;
public abstract class DAraba { // abstract soyu demek cunku bayd si yok, ruh yok.
    public static void main(String[] args) {
        /*
        abstract class da main method opsiyoneldir. yani olabilir de olmayabilirde
    Eger abstract class sadece child class larin tasimak zorunda oldugu ozellikleri belirlemek icin olusturulduysa,
    main method a ihtiyac olmaz. sadece Abstract methodlar olur.
    Ama bir abstract method'da standart belirlemek disinda da method'lar calisabilir
     bu durumda ihtiyac olursa main method olusturulabilir */
    }
    protected abstract void yakit();
    protected abstract void kaporta(); // her child class parent class in standartlarina uymak zorunda demistik
    protected abstract void motor(); // {} musade etmedi, keine budy
    /*
    Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract method'larin body'si olmaz*/
    public void klima(){ // normal {} olusturabiliyiorduk tabi
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan method'lara concrete method denir. Abstract bir method'u abstract keyword ile belirtmek ZORUNLUDUR
        concrete method'larda bunun deklare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
        */

    }


}
