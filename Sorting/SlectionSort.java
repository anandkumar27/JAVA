package Sorting;

public class SlectionSort {
 
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {2,34,4,-2,6,9,3,7};
        int n= arr.length;

        print(arr);

        for(int i =0; i<n-1; i++){
            int min = arr[i];
            int mindex = i;

            for(int j=i+1; j<n; j++){
                if (arr[j] < min){
                    min = arr[j];
                    mindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
    }
}