package Arrays;

import java.util.Arrays;

public class Median {

    public static int meadian(int[] arr, int n) {
        Arrays.sort(arr);

        if (n % 2 == 0) {
            int firstMiddleNum = (n / 2) - 1;
            int secondMiddleNum = (n / 2);
            int evenMiddle = (arr[firstMiddleNum] + arr[secondMiddleNum]) / 2;
            System.out.println(evenMiddle);
            return evenMiddle;
        } else {
            int oddMiddle = n / 2;
            System.out.println(arr[oddMiddle]);
            return oddMiddle;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16};
        Median.meadian(arr, 5);
    }
}
