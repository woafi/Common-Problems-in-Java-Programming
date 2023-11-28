import java.util.*;

 class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*h*l);
    }
}

class equilateralTriangle extends Triangle {
     public void area(int l, int h){
        System.out.println((0.5)*l*h);
    }
}

class circle extends Shape{
    public void area(int r){
        System.out.println(3.1416*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.area();
        t1.area(5, 6);

        
        
        
    }
}
