package test4;

public class RemoteControlExample {

  public static void main(String[] args){

    RemoteControl remote; //인터페이스 변수

    remote = new Television(); //RemoteControl인터페이스를 구현한 구현클래스만 가능

    remote.turnOn();  //출력 : TV를 켭니다.
    remote.turnOff(); //출력 : TV를 끕니다.

    remote = new Audio(); //RemoteControl인터페이스를 구현한 구현클래스만 가능

    remote.turnOn();  //출력 : Audio를 켭니다.
    remote.turnOff(); //출력 : Audio를 끕니다.
  }
  
}
