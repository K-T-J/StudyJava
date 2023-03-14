package test1;

public class WatchTvExample{
  public static void main(String[] args){

    WatchTv watchTv = new WatchTv();
    Parent parent = new Parent();
    Parent parent2 = new Child();
    Child child2 = (Child) parent2;

    

    watchTv.remote(parent); // 정상적 호출

    Child child = new Child();
    watchTv.remote(child); // 자동 타입 변환
  }
}