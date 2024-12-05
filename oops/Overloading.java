package oops;

public class Overloading {

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Overloading over = new Overloading();
       System.out.println( over.sum(11,11));
        System.out.println(over.sum(1,2, 3));
    }
}
