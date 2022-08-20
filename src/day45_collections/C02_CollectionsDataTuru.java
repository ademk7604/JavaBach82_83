package day45_collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /* Collections <dataTuru> nu Object secmeniz durumunda
        collection a farkli data turlerinden objeler koymaniza izin verir.
        Bu depolama acisindan bize esneklik saglar. Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir. depolamak ve yazdirmak acisindan hic bir problemimiz yok   */
        List<String> liste=new ArrayList<>();
        //liste.add(5); mumkun degil
        //liste.add('s');
        //liste.add(true); olmaz
        List<Object> list=new ArrayList<>(); // object hepnisnin babasi
        // bu collections ozelligidir. farkli data turunu barindiriyor.
        // problem surda farkli data turu oldugu icin islem yaparken sikiti verir.
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list);//[5, s, true, Ali]
       //list.set(0,list.get(0)+5); // sen 5 atamistin ama o artik obje sen objeye integer ekleyemezsin
        list.set(0,(Integer)list.get(0)+5); // casting yapinca oldu sorunlar boyle cozulur
        list.set(3,list.get(3)+"Ali"); // string de sikinti vermiyor
        list.set(2,!(boolean)list.get(2)); // casting ile sorunu cozduk
        System.out.println(list); //[1, s, true, Ali]
        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');






    }
}
