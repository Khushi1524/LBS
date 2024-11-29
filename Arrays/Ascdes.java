package Arrays;

import java.util.Arrays;

public class Ascdes {
   
    public static void main(String[] args) {
        int[] arr = {9,1,35,6,67,4};
        Arrays.sort(arr);

      for(int i=0;i<arr.length/2;i++){
        System.out.println(arr[i]);
      }

      for(int i=arr.length-1;i>=arr.length/2;i--){
        System.out.println(arr[i]);
      }
    }
    
}
