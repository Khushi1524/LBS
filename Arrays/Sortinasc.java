package Arrays;

public class Sortinasc {
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,8,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1- i;j++){
                if(arr[j] > arr[j+1]){ 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                   arr[j+1] = temp; 
                }
            }
        }
     
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}