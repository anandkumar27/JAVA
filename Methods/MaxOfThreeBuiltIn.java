package Methods;
 import java.util.*;
public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter the Number:");
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  System.out.println(" Max Nomber is:"+Math.max(Math.max(a,b),c));
    }
}
