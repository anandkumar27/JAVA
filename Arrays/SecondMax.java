package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {2,13,56,83,45,64,45};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // COLCULATE MAX
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) max = arr[i];
            }
            // COLCULATE SECOND MAX
            for(int i=0; i<arr.length; i++){
                if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
