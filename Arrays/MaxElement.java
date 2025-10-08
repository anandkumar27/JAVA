package Arrays;
import java.util.*;
// Print the maximum lement in the array withe help of user input
public class MaxElement {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array length: ");
        // int n = sc.nextInt();
        // System.out.println("Enter a arrray element: ");
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        //System.out.println(max);


        int [] arr = {2,14,151,24,142,22 };
        int max = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
       }
        System.out.println(max);
    }
    
}
