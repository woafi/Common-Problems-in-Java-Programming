class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

// class OuterClass {
//   static class NestedClass {
//       void display() {
//           System.out.println("Inside static nested class");
//       }
//   }
// }

// class OuterClass {
//   private int outerNonStatic = 5;
//   static int outerStatic = 10;

//   static class NestedClass {
//       void display() {
//           // Can access static members of outer class
//           System.out.println("Outer static: " + outerStatic);
//           // Cannot access outerNonStatic because it's non-static
//           // System.out.println("Outer non-static: " + outerNonStatic); // Error
//       }
//   }
// }


public class outerinnerclass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);

    // OuterClass.NestedClass nested = new OuterClass.NestedClass();
    // nested.display();
  }
}
