package day12_stringManipulations;

public class C05_substring {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        String input= "Kaya";
        String tersInput= input.toUpperCase().substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.toLowerCase().substring(0,1);
        System.out.println(tersInput);
    }
}
