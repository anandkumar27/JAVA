package Arrays;
import java.util.Scanner;
public class OutputInputAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // int [] arr = {2,55,5,8,9,-4,-44,10};
    // for(int i=0; i<arr.length; i++){ // INDEX 0 TO n-1, tak jayega 
    //     System.out.print(arr[i]+" ");
    //    }

    int karan[] = new int [7];
    //     //Default Value
    // for(int i= 1; i<7; i++){
    //     System.out.print(karan[i]+" ");
    //     }
        // input 
        for(int i=1; i<7; i++){
            karan[i] = sc.nextInt();
        }
        // Print 
        for(int i=1; i<7; i++){
            System.out.print(2*karan[i]+" ");
        }
    }
}
