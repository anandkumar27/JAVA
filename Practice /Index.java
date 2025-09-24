import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int totalDigit = 0;
        for (int i = 0; i <= num.length(); i++) {
            totalDigit = i;
        }
        System.out.println(totalDigit);
    }
}