package day07_ifStatements;

import day21_Arrays.C05_ArrayeElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C12_C {
    public static void main(String[] args) {
       /*
          List ile calisirken en kotu ozelligi
          elemanlari tek tek eklemek
         */
        Integer[] arr= {2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        System.out.println(Arrays.toString(arr));

        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);
    }
    }