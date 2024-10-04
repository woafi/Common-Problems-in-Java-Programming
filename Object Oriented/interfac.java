interface animal {

    void walk();
}

interface herbivore {
    int eye = 2;
    public void eat();
}

class Horse implements animal, herbivore {
    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("Eat grass");
    }
}

public class interfac {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        System.out.println("Eye: " + h1.eye);
        h1.eat();
    }

}
