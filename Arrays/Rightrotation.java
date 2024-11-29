package Arrays;

public class Rightrotation {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 4, 5, 8 };
        int lastValue = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastValue;

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
    }
}
