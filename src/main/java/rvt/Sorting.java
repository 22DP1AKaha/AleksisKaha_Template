package rvt;

import rvt.temp.A;
import java.util.Arrays;

public class Sorting {
    public static int smallest(int[] array){
        int smallest = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallestIndex = i;
                smallest = array[i];
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;

        for (int i = startIndex; i < table.length; i++){
            if (table[i] < smallest){
                smallestIndex = i;
                smallest = table[i];
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array, 1));
            System.out.println(Arrays.toString(array));
        }
        
    }


}
