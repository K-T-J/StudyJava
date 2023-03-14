package test4;

public class Audio implements RemoteControl{
  
    //필드
    private int volume;

    //turnOn() 추상 메소드의 실체 메소드
    @Override
    public void turnOn() {
      System.out.println( "Audio를 켭니다." );
    }
  
    //turnOff() 추상 메소드의 실체 메소드
    @Override
    public void turnOff() {
      System.out.println( "Audio를 끕니다." );
    }
  
    //setVolume() 추상 메소드의 실체 메소드 (인터페이스 상수를 이용해서  volume 필드의 값 제한)
    @Override
    public void setVolume(int volume) {
      if( volume > RemoteControl.MAX_VOLUME ){  //매개값이 Max 보다 클경우 필드값 Max값으로
        this.volume = RemoteControl.MAX_VOLUME;
      }else if( volume < RemoteControl.MIN_VOLUME ){ //매개값이 Min 보다 작을경우 필드값 Min값으로
        this.volume = RemoteControl.MIN_VOLUME;
      }else{
        this.volume = volume;
      }
      System.out.println( "현재 Audio 볼륨 : " + this.volume );
    }
  
}
