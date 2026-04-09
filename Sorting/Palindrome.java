package Sorting;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abad";
        int i=0;
        int j=str.length()-1;
        Boolean flag = true;
        while (i<j) {
            if (str.charAt(i)!=str.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
