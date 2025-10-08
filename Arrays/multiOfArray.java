package Arrays;

public class multiOfArray {

    // PRINT PRODUCT OF ARRAY 
    public static void main(String [] args){
        int [] arr = {1,2,3,4,};
        int multi = 1;
        for(int i=0; i<arr.length; i++){
            multi *= arr[i];
        }
        System.out.println(multi);
    }
    
}
