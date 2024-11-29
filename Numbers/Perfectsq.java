package Numbers;
public class Perfectsq {
    public static void main(String[] args) {
        int num = 7;
        boolean isPerfectsq = false;
       for(int i =1;i<=num;i++){
        if((i * i) == num){
            isPerfectsq = true;
            break;
        }
       }

       if(isPerfectsq){
        System.out.println("a perfect square");
       }else{
        System.out.println("Not a perfect square");
       }
    }
}
