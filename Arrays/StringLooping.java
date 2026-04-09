package Arrays;

public class StringLooping {
    public static void main(String[] args) {
        String str  = "anand";
        String str1  = "kumar";
        for(int i=0; i<=str.length(); i++){
            System.out.println(str.charAt(i));  // a n a n d  k u m a r
            System.out.println(str.codePointAt(i)); //97 110 100 32 107 117 109 97 114
            // System.out.println(str.concat(str1));
        }
    }
}
