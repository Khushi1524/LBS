package oops;

public class Encapsulation {
    private String name;
    private int roll_no;
    private double grade;
   

    public Encapsulation(String name,int roll_no,double grade){
        this.name = name;
        this.roll_no = roll_no;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public double getGrade(){
        return grade;
    }

    public void setGrade(double grade){
        if(grade >= 0 && grade<=100){
            this.grade = grade;
        }else{
            System.out.println("Invalid");
        }
    }


    public static void main(String[] args) {
        Encapsulation en = new Encapsulation("John",12,90);
        System.out.println(en.getName());
        System.out.println(en.getRoll_no());
        System.out.println(en.getGrade());
        en.setGrade(95);
        System.out.println("Updated : " + en.getGrade());
    }
}
