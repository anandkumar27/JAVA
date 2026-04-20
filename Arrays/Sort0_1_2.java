package Arrays;

public class Sort0_1_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,0,1,2};  // 0 0 0 1 1 2 2
        int zero = 0;  // 3
        int one = 0;   // 2
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0) {
                zero++;
            } else if(arr[i] == 1) {
                one++;
            }
        }

        for (int i = 0; i < zero-1; i++) {
            arr[i] = 0;
        }

        for (int j = zero; j < zero+one; j++) {
            arr[j] = 1;
        }

        for (int k = zero+one; k < arr.length; k++) {
            arr[k] = 2;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
