package Arrays;
import java.util.Scanner;
public class PrintNegativeNo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your size: ");
    int n = sc.nextInt();
    
    int [] arr = new int[n];
    System.out.println("Enter your elements:");
        for(int i=0; i<n; i++)
         arr[i] = sc.nextInt();

         // Printing negative value 
        for(int i=0; i<n; i++){
         if (arr[i]<0) System.out.print(arr[i]+" ");

        }
    }
}
