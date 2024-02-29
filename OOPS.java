import Alok.*;
public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen();
        // p1.setColor("Red");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);

        // BankAcc myAcc = new BankAcc();
        // myAcc.name = "Alok";
        // System.out.println(myAcc.name);
        // // myAcc.password = 123; gives error
        // myAcc.setPassword(123);
        // // System.out.println(myAcc.password); gives error
        // myAcc.getPassword();

        // Student s1 = new Student();
        // Student s2 = new Student("Alok");
        // Student s3 = new Student(14);
        // System.out.println(s2.name);
        // System.out.println(s3.rollno);
        // Student s1 = new Student("alok");
        // s1.rollno = 14;
        // s1.password = 123;
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;
        // Student s2 = new Student(s1);
        // s2.password = 321;
        // s1.marks[2] = 100;
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }

        // Fish shark = new Fish();
        // shark.eat();
        // Dog shiro = new Dog();
        // shiro.eat();
        // shiro.legs = 4;
        // System.out.println(shiro.legs);
        // shiro.bark();
        
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum(1,2,3));
        // System.out.println(calc.sum(1.5f,2.5f));

        // Child c = new Child();
        // c.does();
        
        School s = new School();
        s.schoolName();
    }
}
// Polymorphism
// Method Overriding
class Parent{
    void does(){
        System.out.println("Work");
    }
}
class Child extends Parent{
    @Override
    void does(){
        System.out.println("Nothing");
    }
}
// Method Overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}

// Inheritence
// Base class / Parent class / Super class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
// Derived class / Child class / Sub class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    void bark(){System.out.println("barks");}
}
// Constructors
class Student{
    String name;
    int rollno;
    int password;
    int marks[];
    // Non-parameterized Constructor
    Student(){
        System.out.println("constructor is called...");
    }
    // Parameterized Constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rollno){
        marks = new int[3];
        this.rollno = rollno;
    }
    // copy constructor
    Student(Student s){
        marks = new int[3];
        this.name = s.name;
        this.rollno = s.rollno;
        // Shallow Copy
            // this.marks = s.marks;
        // Deep Copy
        for(int i=0;i<3;i++){
            this.marks[i] = s.marks[i];
        }
    }
} 

// Access Modifier - (Getter and Setter)
class BankAcc{
    String name;
    private int password;
    // Getter Method
    void getPassword(){
        System.out.println(password);
    }
    // Setter Method
    void setPassword(int pwd){
        this.password = pwd;
    }
}

// Encapsulation
class Pen{
    String color;
    int tip;
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}