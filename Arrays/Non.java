package Arrays;

public class Non {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeating = true;
                    break; 
                }
            }
            
            if (!isRepeating) {
                System.out.println(arr[i]);
            }
        }
    }
}
