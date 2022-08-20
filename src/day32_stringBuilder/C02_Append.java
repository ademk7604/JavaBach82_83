package day32_stringBuilder;
public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        sb.append(5); // string strongdur
        sb.append(true); // biz buraya ne eklersek ekleyeyim string gibi goruyor
        System.out.println(sb); // Java daha ne yapsin? 2 3 satirdan sonra ekle yok. // append istedigimiz string i en sonra ekler.

        sb.append("Java", 2,4);
        System.out.println(sb);
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?5true //araya ekleme yapmak istedigimiz de append degil insert kullanmaliyiz

        sb.insert(22,"Valla valla",5,11); // Valla valla nin su kismini ekle diyorum
        System.out.println(sb);
    }
}
