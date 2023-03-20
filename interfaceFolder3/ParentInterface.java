package interfaceFolder3;

public interface ParentInterface {
  public void method1();
  public default void method2(){
    System.out.println("ParentInterface에서 -> method2 실행");
  }
}
