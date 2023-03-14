package test5;

public class Example {
  
  public static void main(String[] args) {
    
    A a1 = new B();
    A a2 = new C();
    A a3 = new D();
    A a4 = new E();

    B b1 = new B();

    a3.method1();
    a4.method1();
    b1.method2();
    b1.method1();
  }
}
