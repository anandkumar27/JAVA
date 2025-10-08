package loops;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        int var = 0;
        while(num > 0){
                int ans = num%10;
                var = var * 10 + ans;
                num = num / 10;
        }
        System.out.println(var);
    }
}
