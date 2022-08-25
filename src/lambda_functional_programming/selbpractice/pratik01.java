package lambda_functional_programming.selbpractice;

import java.util.ArrayList;
import java.util.List;

public class pratik01 {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        //1) Ardışık(arka arkaya) list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        //2) çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        //3) Ard arda  tek list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
        //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
        //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
        System.out.println(liste);
        elemanyazdirma(liste);
        System.out.println();
        ciftlistelemanlariniyaz(liste);
        System.out.println();
        teklisteElemanlarininkareleri(liste);
        System.out.println();
        tekelemanlarinkupleritekrarsiz(liste);
        System.out.println();
        cifteleemanlaimkareleritoplamihesapla(liste);
        System.out.println();


    }

    private static void cifteleemanlaimkareleritoplamihesapla(List<Integer> liste) {
        Integer toplam = liste.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(toplam);
    }

    private static void tekelemanlarinkupleritekrarsiz(List<Integer> liste) {
        liste.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    private static void teklisteElemanlarininkareleri(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    private static void ciftlistelemanlariniyaz(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    private static void elemanyazdirma(List<Integer> liste) {
        liste.stream().forEach(t -> System.out.print(t + " "));
    }
}
