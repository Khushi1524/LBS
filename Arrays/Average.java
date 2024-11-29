package Arrays;

public class Average {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,4};
            int n = arr.length;
            int sum =0;
            float avg =0;

            if(n==0){
              System.out.println("cannot be empty");
            }

            for(int i=0;i<arr.length;i++){
              sum += arr[i];
            }
            System.out.println(sum);
            avg = sum/n;
            System.out.println(avg);
        }
    }

