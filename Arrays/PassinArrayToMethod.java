package Arrays;

public class PassinArrayToMethod {
    public static void main(String[] args) {
        int [] x = {10,20,30,40};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y) {
      y[2] = 99;
    }
}
