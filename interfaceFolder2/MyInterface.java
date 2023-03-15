package interfaceFolder2;

public interface MyInterface {
  public void method1();

  public default void method2(){
    System.out.println("MyInterface에서 method2() 실행");
  }
}
