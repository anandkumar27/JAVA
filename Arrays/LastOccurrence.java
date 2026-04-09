package Arrays;

public class LastOccurrence {
    public static int Ocuurrence(int[] arr, int x){
         int LastIndex=-1;
        for(int i=0; i<arr.length; i++){
          if(arr[i] == x );
           LastIndex = i;
        }
        return LastIndex;
    }
    public static void main(String[] args) {
         int x = 2;
        int[] arr = {2,4,5,2,7,2,6,5};
       int ans = Ocuurrence(arr, x);
        System.out.println(ans);
    }
}
