package Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] arr =  {2,3,4,5,6,1};
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int len = arr.length -2;
        System.out.println(arr[len]);
    }
}
