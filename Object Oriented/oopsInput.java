import java.util.*;
class Student{
    String name;
    int age;
    static String school; // static = can be input without creating an object 

    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: ");
        this.name=sc.nextLine();
        System.out.print("Age: ");
        this.age=sc.nextInt();
    }
    void displayData(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

 public class oopsInput{
    public static void main(String args[]){
        Student.school="JGHS";
        System.out.println(Student.school);
        Student student1 = new Student();
        student1.getData();
        student1.displayData();
    }
}
