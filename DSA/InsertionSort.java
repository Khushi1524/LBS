package DSA;

public class InsertionSort {
 public static void InsertionSort(int[] arr){
    for(int i=1;i< arr.length;++i){
        int key = arr[i];
        int j = i-1;

        while (j >= 0 && arr[j]> key) {
            arr[j+1] = arr[j];
            j= j-1;
        }
        arr[j+1] = key;
    }
     
 }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        long starttime = System.nanoTime();

        InsertionSort(arr);

        long endtime = System.nanoTime();

        for(int k =0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println("\nExecution time :"+ (endtime - starttime));

    }
}
