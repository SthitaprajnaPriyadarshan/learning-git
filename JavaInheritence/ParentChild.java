class Parent {
  public void walk() {
    System.out.print(" Parent->walk >>");
  }
  public void run() {
    System.out.print(" Parent->run >>");
    walk();
  }
}

class Child extends Parent {
  @Override
  public void walk() {
    System.out.print(" Child->walk >>");
    super.walk();
  }
  
  @Override
  public void run() {
    System.out.print(" Child->run >>");
    super.run();
  }
}

public class ParentChild {
  public static void main(String args[]) {
    Parent p = new Child();
    p.run();
  }
}
