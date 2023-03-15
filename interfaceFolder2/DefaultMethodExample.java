package interfaceFolder2;

public class DefaultMethodExample {
  public static void main(String[] args) {
    MyInterface mi1 = new MyClassA();
    mi1.method1();  //출력 : MyClassA에서 method1() 실행
    mi1.method2();  //출력 : MyInterface에서 method2() 실행

    MyInterface mi2 = new MyClassB();
    mi2.method1();  //출력 : MyClassB에서 method1() 실행
    mi2.method2();  //출력 : MyClassB에서 method2() 실행
  }
}
