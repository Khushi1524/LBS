package Numbers;
public class Occurance {
    public static void main(String[] args) {
        int num = 1222334455;
        int target = 4;
        int count = 0;
      while(num > 0){
        int rem = num % 10;
        if(rem == target){
            count++;
        }
        num = num/10;
      }
      System.out.println(target + " occurred " + count + " times");
    }
}
