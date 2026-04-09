package Sorting;

public class SelectionsortE {
     static void sort (int [] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){ // repersent the current index 
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if (arr[j] < arr[min_index]) {
                    min_index =j;
                }
            }
            //Swap current element and mini element current element i will have correct element 
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
            
        }
     }
     public static void main(String[] args) {
        int[] arr = {9,4,6,8,2,1,45};
            sort(arr);
            for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            }
     }
}
