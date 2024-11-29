package Arrays;

public class Equality {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        boolean isEqual = true;

        if (arr1.length != arr2.length) {
            System.out.println("arrays are not equal");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
             isEqual = false;
             break;
            }
        }

        if(isEqual){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

    }
}
