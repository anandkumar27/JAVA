package Pattern;
import java.util.Scanner;
public class Peramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1; i<=n; i++){ // lines
        //     for(int j=1; j<=n-i; j++){ //space
        //     System.out.print(" "+" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){ //Stars 
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        //     }

        // METHOOD => 2
         int nsp = n-1, nst =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst +=2;
            System.out.println();
        }
             nsp =1;
             nst = 2*n-3;
        for(int i=1; i<=n-1; i++){  // LINES
            for(int j=1; j<=nsp; j++){  // SPACES
                System.out.print(" "+" ");
            }
            for(int j=1; j<=nst; j++){   //STARES
                System.out.print("*"+" ");
            }
            nsp++;
            nst -=2;
            System.out.println();
        }
     }
}
