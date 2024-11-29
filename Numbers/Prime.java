package Numbers;
public class Prime {
    public static void main(String[] args) {
        int num = 1;
        boolean isPrime = true;
        if(num < 2){
            System.out.println("Not prime");
            return;
        }

        for(int i =2;i<num/2;i++){
            if(num % i ==0){
               isPrime = false;
               break;
            }
        }

        if(isPrime){
            System.out.println(num +" "+ "is prime");
        }else{
            System.out.println(num +" "+ "is not prime");
        }

    }
}
