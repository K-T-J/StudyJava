package interfaceFolder3;

public class InterfaceExample {
  public static void main(String[] args) {
    ChildInterface chi1 = new ChildInterface() {
      @Override
      public void method1() {
        System.out.println("ChildInterface에서 익명구현 객체 -> method1 실행");
      }
      @Override
      public void method3() {
        System.out.println("ChildInterface에서 익명구현 객체 -> method3 실행");
      }
    };

    chi1.method1(); //출력 : ChildInterface에서 익명구현 객체 -> method1 실행
    chi1.method2(); //출력 : ParentInterface에서 -> method2 실행
    chi1.method3(); //출력 : ChildInterface에서 익명구현 객체 -> method3 실행
  }
}
