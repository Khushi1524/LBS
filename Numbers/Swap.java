package Numbers;
public class Swap {
    public static void main(String[] args) {
        //without third variable
        // int x = 10;
        // int y = 20;
        // System.out.println( "x :"+ x + ","+ "y :" + y);
        // x = x + y;
        // y = x - y;
        // x = x - y;
        // System.out.println( "x :"+ x + ","+ "y :" + y);
         

        //with third variable
        int a = 30;
        int b = 40;
        int temp ;
        System.out.println( "a :"+ a + ","+ "b :" + b);
        temp = a; // temp = 30
        a = b; // a = 40
        b = temp; // b = 30
        System.out.println( "a :"+ a + ","+ "b :" + b);

    }
}
