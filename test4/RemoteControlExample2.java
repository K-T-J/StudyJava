package test4;

public class RemoteControlExample2 {

  public static void main(String[] args) {
    RemoteControl remote = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("turnOn 실행~~");
      }

      @Override
      public void turnOff() {
        System.out.println("turnOff 실행~~");
      }
      @Override
      public void setVolume(int volume) {
        System.out.println("setVolume 실행 volume = " + volume);
        testMethod();
      }
      public void testMethod(){
        System.out.println("testMethod 실행");
      }
    };

  remote.turnOn();
  remote.turnOff();
  remote.setVolume(10);
  //remote.testMethod();
  }
}
