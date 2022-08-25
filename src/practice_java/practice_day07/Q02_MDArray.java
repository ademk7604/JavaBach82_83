package practice_java.practice_day07;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double toplam = 0;
        for (int i = 0; i < 3; i++) { // arr.length yerine direk sayi olarak yazabilirsin
            for (int j = 0; j < 3; j++) { // inner for da da hepsi 3 oldugu icin 3 yazilabilir
                if (arr[i][j].contains("$")) { // $ iceroyorsa
                    toplam += Double.parseDouble(arr[i][j].replace("$", "")) * 3.2;
                    // parantez icindeki relaceAll methodu ile $ isaretinden kurtulduk,
                    //sonra elimizde "12" var (data type : String)
                    //Double toplam veriable ile isleme katmak icin data casting yapmak gerekir,
                    //bu yuzden Double.parseDouble() methodu
                    //bu asamada 12 degeri data type: Double oldu, eklerken de 3.2 ile carptik

                } else {
                    toplam += Double.parseDouble(arr[i][j].replace("€", "")) * 4.2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr)); // ekstra boyle yazalim gorelim. soru da istememisti
        System.out.println("toplam = " + toplam);
    }
}

