package Arrays;

public class Leftrotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int firstValue = arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = firstValue;

        for(int j=0;j<arr.length;j++){
          System.out.println(arr[j]);
        }

     
    }
}