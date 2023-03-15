package interfaceFolder;

public class Example {
  public static void main(String[] args) {
    InterfaceCImpl implC = new InterfaceCImpl();
    InterfaceA a = implC;
    a.methodA(); //InterfaceA 변수는 methodA()만 호출 가능

    InterfaceB b = implC;
    b.methodB(); //InterfaceB 변수는 methodB()만 호출 가능

    InterfaceC c = implC;
    c.methodA();
    c.methodB();  //InterfaceC 변수는 모두 호출 가능
    c.methodC();
  }
}
