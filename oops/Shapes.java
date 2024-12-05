package oops;

public class Shapes {

    public void display(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shapes{
    
    public double getArea(int radius){
      return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("This is a circle");
        super.display();
    }

    public static void main(String[] args) {
       Shapes shapes = new Shapes();
       shapes.display();
       
       Circle circle = new Circle();
       System.out.println(circle.getArea(5));;
    }
}
