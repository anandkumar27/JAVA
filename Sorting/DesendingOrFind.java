package Sorting;

public class DesendingOrFind {
    static int search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[mid] < tar) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {100, 91, 87, 76, 66, 52, 43, 35, 29, 19, 5};
        int tar = 43;

        int ans = search(arr, tar);
        System.out.println("Index: " + ans);
    }
}
