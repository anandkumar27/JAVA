package Pattern;
import java.util.Scanner;

public class strTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
       int  n = sc.nextInt();
        // for(int i= 1; i<=n; i++){
        //     for(int j=n; j>=i; j--){
        //        System.out.print("*");
        //       //  System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        //}


       // METHODE TWO =>
       for(int i=1; i<=n; i++){
        for(int j=1; j<=n+1-i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}
