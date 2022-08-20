package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int [] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();
        // array deki tum elemanlari inceleyelim, tek sayi olanlari list'e atalim
        // maksat urunleri siralamak degil yemek ise foreachLoop
        // bununn avantaji index lazim degilse bicilmis kaftan:)
        for (int each: arr // gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
             ) {

            if(each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);

    }
}
