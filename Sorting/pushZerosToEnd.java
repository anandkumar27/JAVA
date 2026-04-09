package Sorting;

public class pushZerosToEnd {
public static void print(int [] arr){
    for(int ele : arr){
        System.out.print(ele+" ");
    }
     System.out.println();
}
    public static void main(String[] args) {
        int [] arr = {2,9,0,4,0,5,7,0,1};
        print(arr);
        int n = arr.length;
    //     for(int i=0; i<n-1; i++){
    //         for(int j=0; j<n-1-i; j++){
    //         if (arr[j]==0) {
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;
    //         }
    //     }
    //  }
    //  print(arr);

    // Optimized code 
    int index = 0;
    for(int i=0; i<n; i++){
        if (arr[i] !=0) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index++;
        }
    }
    print(arr);
    } 
}
