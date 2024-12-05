package oops;

class Salary {
    double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    public void calculateTax() {
        System.out.println("Calculating tax for general profession...");
    }
}

class Accountant extends Salary {
    public Accountant(double salary) {
        super(salary); 
    }

    @Override
    public void calculateTax() {
        double tax = salary * 0.12; 
        System.out.println("Accountant's Tax: " + tax);
    }
}


public class Main {
    public static void main(String[] args) {
        Salary accountant = new Accountant(50000);
        accountant.calculateTax();  
    }
}
