package lambda_functional_programming.lambda_parctice;

import java.util.ArrayList;
import java.util.List;

public class Runner01 extends Lambda01{//inherite birazdan
    public static void main(String[] args) {
        // aHarfleriSilenGerisiniYazdiran(names);
        System.out.println("**************");
        //  maxElemanBul(numbers);
        System.out.println("**************");
        //  elemanlariTopla(numbers);
        System.out.println("**************");
        elemanlariCarp(numbers);
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
        System.out.println("**************");
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println("uzunlugu12denAzmi(liste) = " + uzunlugu12denAzmi(liste));

    }
    public static boolean uzunlugu12denAzmi(List<String> list){
        return list.stream().allMatch(t->t.length()<12);
    }
}