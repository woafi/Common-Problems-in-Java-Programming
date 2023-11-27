public class functionOverloading{
    public static void printInfo(String name){
        System.out.println("Name: "+name);
    }

    public static void printInfo(int age){
        System.out.println("Age: "+ age);
    }

    public static void printInfo(String name, int age){
        System.out.println("Name: "+name+" "+"Age: "+ age);
    }

    public static void main(String[] args) {
       printInfo("Woafi");
       printInfo(24);
       printInfo("Woafi", 24);
        
    }
    
}