package practice_java.practice_day09.restourant;
public class Mutfak {
    public String yemekler="adanakebap,urfaciger,ksubasi,kusleme";
    public String araSicak="yaylacorbasi,mercimek,duguncorbasi,corba";
    public String tatlilar="adanakebap,urfaciger,ksubasi,kunefe";
    public String icecekler="adanakebap,urfaciger,ksubasi,salgam";
    public Mutfak() {}
    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler = adanakebap;
        this.araSicak = mercimek;
        this.tatlilar = kunefe;
        this.icecekler = salgam;}
    @Override
    public String toString() { // butun instence veriableleri yazdiran kodumuzdur.
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ", \naraSicak='" + araSicak + '\'' +
                ", \ntatlilar='" + tatlilar + '\'' +
                ", \nicecekler='" + icecekler + '\'' +
                '}';
    }
}
