package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Kayra");

        sb.substring(0,3);// bize subsitring degil string donduruyor. string class indan calisiyor.
       // Bu method string dondurdugu icin StringBuilder' in eski halini degistiremez.
        System.out.println(sb); // Kayra. ama neden yaaa
        sb.subSequence(0,3);
        System.out.println(sb); //Kayra
    }
}
