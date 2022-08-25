package practice_java.practice_day08;

public class Q07_SurviveMonkey {
     /*
        There is a lonely monkey in the island
        He needs to eat 4 bananas every day
        there are just 165 bananas in that island
        Create following variables and find how many days
        monkey can survive.
        Use do while loop, increment and decrement and if statements
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;
        */
     public static void main(String[] args) {
         int numberOfBananas =165, survivalDays = 1;
         boolean monkeyAlive = true;
         do{
             System.out.println("maumunlar gunde 4 muz yer");
             numberOfBananas-=4; // tolam 4 azalir
             survivalDays++;// yasadigi gun sayisi ni 1 arttir
             if (numberOfBananas<4){
                 monkeyAlive=false;
                 System.out.println("Bugun "+ survivalDays + " . gun muz kalmadi, maymun sizlere omur..:(");
             }else{
                 System.out.println("bugun "+survivalDays+ " gun, maymun halen jayatta...:)");
             }
         } while (monkeyAlive);
         System.out.println("toplam yasadigi gun sayisi : " +(survivalDays-1));
     }
}
