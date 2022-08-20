package practice_day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/
    /*
    daha onceliklen scanner obj ilusturacagiz
    onvelikle split methodu kullanacagiz
    sonra sort yapcaz. for loop a alcaz
    if ile control yapicaz ve soiut ile yazdiracagiz
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Bir string ifade giriniz ede");
        String str=scanner.nextLine();

        String [] arr=str.split(""); // split array dondurur

        System.out.println("arr = " + Arrays.toString(arr));
        //sort la
        Arrays.sort(arr);
        System.out.println("arr nin sonrtlanmis hali= " + Arrays.toString(arr));
        int counter=0;
        for (int i = 1; i < arr.length(); i++);{
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else{
                System.out.println(arr[i-1] + "sayisi "+counter);
            }
        }

        */
    }
}
