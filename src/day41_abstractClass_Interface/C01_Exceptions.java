package day41_abstractClass_Interface;
public class C01_Exceptions {
    public static void main(String[] args) {
        try {
            calis();
        } catch (Exception e) {
            throw new RuntimeException(e);}
    }
    private static void calis() {
        throw new RuntimeException("Cooook calis");
        // throw ile kontrollu exception olustururken parametre olarak istedigimiz hata mesajini girebiliriz.
    }
}
