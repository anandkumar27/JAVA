package Arrays;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length: ");
        int n = sc.nextInt();
        System.out.println("Enter a arrray element: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Integer.MIN_VALUE) {
                sum = sum + arr[i];
            }
        }
        System.out.print("Total Sum : ");
        System.out.println(sum);
    }
}
