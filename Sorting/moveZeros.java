package Sorting;

public class moveZeros {
    static void Sort(int [] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j=0; j< n-i-1; j++){
                if (arr[j] ==0 && arr[j+1] != 0) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,0,50,2,0,2,0,3,5};
        Sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
