package practice_day07;

public class Q01_MDArray {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3, 0, -1}};
        int minimumDeger = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr [" + i + "]. " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<minimumDeger){
                    minimumDeger=arr[i][j];
                }
            }
        }
        System.out.println(minimumDeger);
    }
}
