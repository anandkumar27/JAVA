package Sorting;
public class bubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
       int [] arr = {12,3,41,32,34,5,90,65,45,-3,4};
        print(arr);
        System.out.println();

        // for(int i=0; i<arr.length-1; i++ ){
        //     for(int j=0; j<arr.length-1-i; j++){
        //         if (arr[j]> arr[j+1]) {
        //             int  temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
                
        //         }
        //     }
        // }


//Bubble sort code optimization 
         for(int i=0; i<arr.length-1; i++ ){
             boolean isSorted = true;
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    int  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  isSorted = false;
                }
            }
            if (isSorted==true) break;
        }
        print(arr);
     }
  }
       
                   
