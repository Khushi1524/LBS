package Numbers;
public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int n = num;
        while (num > 0) {
            int rem = num % 10;
            result += rem* rem * rem;
            num = num/10;
        }
        if(n == result){
            System.out.println("Is a armstrong num");
        }else{
            System.out.println("not a armstrong");
        }
    }
}
