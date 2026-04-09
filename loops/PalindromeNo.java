package loops;

public class PalindromeNo {
    public static void main(String[] args) {
        int num = 121;
        int var = 0;
        while(num>0){
            int mod = num%10;
            var = var * 10 + mod;
            num = num/10;
       }
       System.out.println(var);
    }
}
