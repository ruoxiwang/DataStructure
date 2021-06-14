package Comparison;

public class Main {
    public static void main(String[] args) {
        int[] test_array = {10, 20, 90, 33, 44 ,233, 9, 8};
        int[] result_array = new BubbleSort().BubbleSortAscending(test_array);
        for (int i = 0; i < result_array.length; i++) {
            System.out.println(result_array[i] + "_");
        }
    }
}
