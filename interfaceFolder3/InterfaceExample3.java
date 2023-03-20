package interfaceFolder3;

public class InterfaceExample3 {
  public static void main(String[] args) {
    ChildInterface3 ci3 = new ChildInterface3() {
      @Override
      public void method1() {
        System.out.println("ChildInterface3에서 익명구현 객체 -> method1 실행");
      }
      @Override
      public void method2() {
        System.out.println("ChildInterface3에서 익명구현 객체 -> method2 실행");
      }
      @Override
      public void method3() {
        System.out.println("ChildInterface3에서 익명구현 객체 -> method3 실행");
      }
    };
    ci3.method1(); //출력 : ChildInterface3에서 익명구현 객체 -> method1 실행
    ci3.method2(); //출력 : ChildInterface3에서 익명구현 객체 -> method2 실행
    ci3.method3(); //출력 : ChildInterface3에서 익명구현 객체 -> method3 실행
  }
}
