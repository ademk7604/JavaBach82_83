package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C10_calisma {
    public static void main(String[] args) {

        String[] str={"Ali","omer","Ahmet"};
        List<String> list=new ArrayList<>();
        for (int i = 0; i <str.length ; i++) {
            list.add(str[i]);

        }

        System.out.println(Arrays.toString(str));
        Collections.sort(list);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        System.out.println(Arrays.toString(str));
    }
}
