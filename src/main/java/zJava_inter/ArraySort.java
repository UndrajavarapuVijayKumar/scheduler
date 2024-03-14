package zJava_inter;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        descendingOrder();

    }
    public static void descendingOrder(){
        Integer [] a = {100,200,300,400,500,900,700,800};
        // Sort in ascending order
        Arrays.sort(a);
        // Convert array to List, reverse it, and convert it back to array
        List<Integer> list = new ArrayList<>(Arrays.asList(a));
        Collections.reverse(list);
        a = list.toArray(new Integer[0]);

        // Print the sorted array in descending order
        System.out.println("Array in descending order: " + Arrays.toString(a));
    }
    public static void ascendingOrder(){
        int[] a = {100,200,300,400,500,900,700,800};
        System.out.println(a);
        Arrays.sort(a);
        for (int x:a
        ) {
            System.out.println(x);

        }
    }
}
