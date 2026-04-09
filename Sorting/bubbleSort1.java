package Sorting;

public class bubbleSort1 {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
      int [] arr = {12,3,41,32,34,5,90,65,45,3,4};
      print(arr);
     System.out.println();
     for(int j=0; j<arr.length-1; j++){
      for(int i=0; i<arr.length-1; i++){
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
      }
    }
     print(arr);
    }
}
