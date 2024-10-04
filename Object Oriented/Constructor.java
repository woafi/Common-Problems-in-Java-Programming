import java.util.*;

class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constructor create
    Student(String name, int age) {
        // System.out.println("constructor called");
        this.name = name;
        this.age = age;
    }
}

public class Constructor {
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        Student student1 = new Student("Mohammad woafi", 24);

        /*
         * System.out.println("Student Name: ");
         * student1.name =sc.nextLine();
         * student1.age =24;
         */

        // constructor called

        student1.printinfo();

    }

}
