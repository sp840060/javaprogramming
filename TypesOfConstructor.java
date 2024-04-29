package OOPS;
// Polymorphism 
public class TypesOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();   // Constroctor overloading 
        Student s2 = new Student("Sandeep"); // Constroctor overloading 
        Student s3 = new Student(123); // Constroctor overloading 
    }
}
class Student{
    String name;
    int Roll;

    Student(){
        System.out.println( "This Constructor");
    }
    Student(String name){
        this.name = name;
    }
    Student(int Roll){
        this.Roll = Roll;
    }
}
