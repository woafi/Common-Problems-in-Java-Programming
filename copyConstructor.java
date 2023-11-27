class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor create
    Student(String name, int age){
        //System.out.println("constructor called");
        this.name=name;
        this.age=age;
    }
    //copyconstructor create
    Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
    }
}
public class copyConstructor {

    public static void main(String args[]){
    Student student1 = new Student("Mohammad Woafi", 24);

    student1.printinfo();
        //2nd constructor
    Student s2 = new Student(student1);

    s2.printinfo();

   }
    
}
