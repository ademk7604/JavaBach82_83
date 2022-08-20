package day40_final;
public abstract class CAbstract { // basina abstract yazmak ortak ozelligidir.
    void toplama() { // ben herhangi bir calss dada bu methodu koyabiliridim. yani bu method icin abstract yapmak zoprunda degildim.
        System.out.println("Bu method toplama yapar");
    }
    abstract void carpma();
    abstract void bolme();
    //abstract void cikarma(){
    //} diyorki ja abstract sahip ol yada methoda
    void cikarma(){
        System.out.println("Bu method cikarma yapar");
    }
    /* bir method'un basina abstract yazarsaniz bu method'un child class'lar icin bir standart oldugunu declare ederiz
     ve method body'sine ihtiyac kalmaz
     */

}
