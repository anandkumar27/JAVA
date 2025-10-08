package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int targate = 13;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == targate){
                found = true;
                break;  
            }
        }
        if(found == true){
            System.out.println("targate is Exsist:");
        }else{
            System.out.println("Targate is not Exsist:");
        }
        System.out.println();
    }
}
