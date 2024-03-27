/*
 *Created By: Undrajavarapu Vijay Kumar
 *Project: Scheduler_Capstone
 *
 */


package zJava_inter;

public class arrays {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10,20,30,40};
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
