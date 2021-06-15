package Comparison;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {
    public int[] BubbleSortAscending(int @NotNull [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int first_item = array[i];
            boolean sorted = false;
            for (int j = i + 1; j < array.length; j++) {
                int second_item = array[j];
                if (first_item > second_item) {
                    int temp = array[i];
                    array[i] = second_item;
                    array[j] = temp;
                    sorted = true;
                }
            }
            if (sorted) break;
        }
        return array;
    }
}