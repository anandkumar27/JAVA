import java.util.*;
public class compositeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Your Number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    //for(int i=2; i<=n-1; i++){
    for(int i=1; i<=Math.sqrt(n); i++ ){
            System.out.println("Composite Number:");
            if(n%i ==0){
                System.out.println(i);

            
            }
    
        }
     
    }
}
