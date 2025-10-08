package Arrays;

public class FoundArrEle {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,13};
        int target = 12;
        
        int found = -1; // -1 means targate Array me nahi hai 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = i;
                break;
            }
        }
        
        if (found != -1) {
            System.out.println("I got element: "+found);
        } else {
            System.out.println("Targate missing in array ");
        }

    }
}
