package Arrays;
import java.util.Arrays;

public class TowSum {
    // [1,2,3,4,5]. == 7.  // [3,4]

    static int[] twosum(int[] arr){
        int[] findIndex = new int[2];
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    findIndex[0] = i;
                    findIndex[1] = j;
                }
            }
        }
        return findIndex;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = twosum(arr);
        System.out.println(Arrays.toString(ans));
    }
}
