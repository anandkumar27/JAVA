package Arrays;

public class MultiOddAddEven {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for(int i=0; i<arr.length; i++){
            if(i%2 != 0){
             System.out.print(2 * arr[i]+" ");
            }
            else {
                System.out.print(arr[i]+10+" ");
            }
            System.out.println();
        }
     }
}
