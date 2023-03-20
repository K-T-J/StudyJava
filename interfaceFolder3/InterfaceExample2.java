package interfaceFolder3;

public class InterfaceExample2 {
  public static void main(String[] args) {
    ChildInterface2 ci2 = new ChildInterface2() {
      @Override
      public void method1() {
        System.out.println("ChildInterface2에서 익명구현 객체 -> method1 실행");
      }
      @Override
      public void method3() {
        System.out.println("ChildInterface2에서 익명구현 객체 -> method3 실행");
      }
    };
    ci2.method1(); //출력 : ChildInterface2에서 익명구현 객체 -> method1 실행
    ci2.method2(); //출력 : ChildInterface2에서 -> method2 재정의
    ci2.method3(); //출력 : ChildInterface2에서 익명구현 객체 -> method3 실행
  }
}
