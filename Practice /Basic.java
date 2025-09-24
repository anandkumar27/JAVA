import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your range:");
        //  int n = sc.nextInt();
        // 2,5,8,11,14......
        // for(int i=3; i<=3*n-1; i+=3){
        //     System.out.println(i);
       // }
      //method 2
    //    int a=4, b=6;
    //    for(int i=2; i<=n; i++){
    //     System.out.println(a+" ");
    //     a += b;
    //    }

   // number 99,95,91,87... n Term 
        // for(int i=50;i > 1; i--){
        //     System.out.print(i+" ");
        //     i =  i - 4;
        // }

    // Display this GP- 1,2,4,8,12..., upto 'n' term
         int n = sc.nextInt();
         int a=1, r=2;
         for(int i=1; i<=n; i++){
            System.out.println(a +" ");
            a *=r;
         }
    }
}
