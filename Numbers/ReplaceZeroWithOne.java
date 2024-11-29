package Numbers;
public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        int num = 1023040506;  
        int result = 0;
        int place = 1; 

        
        while (num > 0) {
            int rem = num % 10;  
            if (rem == 0) {
                rem = 1; 
            }
            result = rem * place + result; 
            place *= 10;  
            num = num / 10; 
        }

        System.out.println("Modified number: " + result);
    }
}

