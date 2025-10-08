package Arrays;

public class MinElementArray {
    public static void main(String[] args) {
        int arr [] = {13,3,32,-21,34,86};
          int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min) min = arr[i];
        }
        System.out.println(min);
    }
}
