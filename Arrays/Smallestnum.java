package Arrays;

public class Smallestnum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,8,4,6};
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
