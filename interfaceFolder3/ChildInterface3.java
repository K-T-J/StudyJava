package interfaceFolder3;

public interface ChildInterface3 extends ParentInterface{
  @Override
  public void method2(); //추상 메소드로 재선언 (default키워드 삭제)
  public void method3();
}
