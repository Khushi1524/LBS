package Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 43, 4, 3, 2, 4 };
       int[] frequency = new int[100];

       for(int i=0;i<arr.length;i++){
        frequency[arr[i]]++;
       }

       for(int j=0;j<frequency.length;j++){
        if(frequency[j] > 0){
            System.out.println(j +" " + frequency[j] );
        }
       }

    }
}
