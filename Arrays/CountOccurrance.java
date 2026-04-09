package Arrays;
import java.util.*;
public class CountOccurrance {
   public static int CountNumber(int[] arr, int x){
    int Count = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == x){
        Count++;
        }
    }
    return Count;

   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sizze of Array:");
        int n = sc.nextInt();

        System.out.println("Enter" +  n  + " Element" );
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();

        }

    System.out.println("Enter x:");
    int x = sc.nextInt();
    System.out.println("Count of x:" +CountNumber(arr, x));
    }
}
