package Sorting;

public class insertionSort {
    static void Sort(int [] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j =i;
            while (j > 0 && arr[j] < arr[j-1]) {
                //swap  arr[j] , arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp; 
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {10,8,9,4,11,2};
        Sort(arr);
        for(int ele : arr){
            System.out.print(ele+" " );
        }
    }
}
