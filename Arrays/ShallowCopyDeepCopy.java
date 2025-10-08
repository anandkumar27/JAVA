package Arrays;
import java.util.Arrays;
public class ShallowCopyDeepCopy {
  public static void main(String[] args) {
    int a = 4; // byte lata hai ye 
    int[] arr = {2,5,6,9,4};
    // int[] x = arr; // x is Shallow Copy of array ;
    // x[0] = 10;
    int[] y = Arrays.copyOf(arr, arr.length); // Deep Copy
    y [0] =100;
    System.out.println(y[0]);
    System.out.println(arr[0]);
    }
}
