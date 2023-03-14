package test5;

public class B implements A{
  @Override
  public void method1() {
    System.out.println("B -> A 구현");
  }
  public void method2(){
    System.out.println("사용 가능?");
  }
}
