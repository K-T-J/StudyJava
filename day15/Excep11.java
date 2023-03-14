package day15;
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);//Exception 클래스의 Exception (String msg) 생성자 호출
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
	
}
public class Excep11 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("저장 공간을 확보한 후 다시 설치하시기 바랍니다.");
		}catch(MemoryException e) {//MemoryException가 :"메모리가 부족합니다."라는 메세지를 들고있어서 e가 가지고있다.
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("메모리 부족, 다른 프로그램 종료하시고 다시 시도해주세요.");
			
		}finally{
			deleteTempFiles();
			
		}
		
		
	}
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {//enoughSpace 호출하고 true를 가져오는데 !라 false
			throw new SpaceException("설치 공간이 부족합니다.");
		}
		if(!enoughMemory()) {//enoughMemory 호출하고 false를 가져오는데 !라 true
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	static boolean enoughSpace() {
		return true;	// true : 공간충분
	}
	static boolean enoughMemory() {
		return false;	// true : 메모리충분
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {System.out.println("임시파일 삭제");}
	
	
	
	
}
