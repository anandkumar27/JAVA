package Sorting;

public class isSorted {
    public static void main(String[] args) {
        int arr [] = {2,34,5,3,34,23,98,2,29};

        for(int i=0; i<arr.length; i++){
            if (arr[i] > arr[i+1]) {
                System.out.println(false);
            }else{
                System.out.println(true);
                break;
            }
        }
    }
}
