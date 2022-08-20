package day35_inheretancedaConstructurKullanimi;
public class AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /* Her class da gorunmese bile bir Constructur vardir.
    Bu class dan obje olusturmak istedigimizde
    default constructur devreye girecektir.

    Default constructur i gozlemleyemeyecegimiz icin onun yerine kullanilabilecek
    parametresiz bir const olusturalim */
    protected String granpaKlupAdi="Grandpa Kulubu";
    AGrandParent (){ // bu sekilde
        System.out.println("Grandpa constructur calisti"); // sirf gormek icin yazdik
    }
}
