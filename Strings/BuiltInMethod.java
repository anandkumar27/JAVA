package Strings;

public class BuiltInMethod {
    public static void main(String [] args){

        //  String s = "msfnadfuahfSAHDpfjdfhAHDAJD";

        // System.out.println(s.indexOf("a"));  // using this meadthos find first indx in String

        // System.out.println(s.lastIndexOf("a")); // using this method to find last index of String
        // System.out.println(s.indexOf("q"));  // not avilable then return -1

        // System.out.println(s.toLowerCase()); // convert all String in small latter 
        // System.out.println(s.toUpperCase()); // conver all string inn capital latter

        String str = "harshita";
        System.out.println(str.contains("harsh"));

        if(str.contains("harsh")){
            System.out.println("happy");

            System.out.println(str.startsWith("h"));
            System.out.println(str.startsWith("k"));
        }
    }
}
