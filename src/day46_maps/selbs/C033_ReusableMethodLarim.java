package day46_maps.selbs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C033_ReusableMethodLarim {
    public static Map<Integer, String> mapOlustur() {
        Map<Integer, String> sinifMapem = new HashMap<>(); // map ile ugrasiyorsak sabirli olmaliyiz
        sinifMapem.put(101, "Tufan, Can, JDev");
        sinifMapem.put(102, "Enes, Cem, Tester");
        sinifMapem.put(103, "Taha, Emre, JDev");
        sinifMapem.put(104, "Derya, Deniz, Dewops");
        sinifMapem.put(105, "Enes, Can, Tester");
        sinifMapem.put(106, "Tahaa, Deniz, Tester");
        sinifMapem.put(107, "Derya, Cem, Tester");
        return sinifMapem;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMapem) {
        int sira=1;
        for (String each:ogrenciMapem.values()
             ) {
            System.out.println(sira+ "- "+each);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiDondur(Map<Integer, String> ogrenciMapem) {
        List<String> methoddakiListem= new ArrayList<>();
        String[] eachArr;
        for (String each:ogrenciMapem.values()
             ) {
            eachArr = each.split(", ");
            methoddakiListem.add(eachArr[0]+ " "+eachArr[1]);
        }

        return methoddakiListem;
    }
}
