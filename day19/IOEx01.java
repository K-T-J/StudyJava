package day19;

import java.io.File;
import java.io.IOException;

public class IOEx01 {
	public static void main(String[] args) {
		
		//window = 경로 적을때 역슬래쉬 \ 두개

			//C:\Windows\setupact.log
		File f = new File("C:\\Windows\\setupact.log");
		
		//사이즈
		long size = f.length();
		System.out.println(f);
		System.out.println(size);
		
		//파일 이름
		String name = f.getName();
		System.out.println(name);
		
		//파일 경로
		String path = f.getPath();
		System.out.println(path);
		
		//상위 폴더
		String parent = f.getParent();
		System.out.println(parent);
		
		//파일타입 판별
		if(f.isFile()) System.out.println(f.getAbsolutePath() + "는 파일입니다"); 
		else if(f.isDirectory()) System.out.println(f.getAbsolutePath() + "는 디렉토리다.");
		
		System.out.println("숨긴 속성 : " + f.isFile());
		System.out.println("읽기 속성 : " + f.canRead());
		System.out.println("쓰기 속성 : " + f.canWrite());
		System.out.println(new java.util.Date(f.lastModified()));
		
		
		File f2 = new File("C:\\Windows");
		File [] subfiles = f2.listFiles();
		for(int i = 0; i < subfiles.length; i++) {
			System.out.println(subfiles[i].getName());
			System.out.println("\t 파일크기 :" + subfiles[i].length());
		}
		
		
		
		//파일 만들기
		File f3 = new File("E:\\KTJ\\kor.txt");//kor.txt 없는거라도 만들 이름 작성
		
		try {
			f3.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
