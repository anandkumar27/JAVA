package Arrays;

import java.util.Arrays;

public class Question {
    static int[] sort(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length -1]};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,6};
        int[] res = sort(arr);
        System.out.println("Smallest: " + res[0]);
        System.out.println("Largest: " + res[1]);
        
    }
}
