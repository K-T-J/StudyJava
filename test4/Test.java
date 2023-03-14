package test4;

public abstract class Test implements RemoteControl{
  
  @Override
  public void turnOn() {
    System.out.println("123");
  }

  @Override
  public void turnOff() {
    System.out.println("456");
  }
}
