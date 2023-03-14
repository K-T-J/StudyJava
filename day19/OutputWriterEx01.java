package day19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class OutputWriterEx01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		String str = "파일 생성 시간 :" + date;
		System.out.println("문자열 입력 >>>");
		str += sc.nextLine();
		
		FileOutputStream fos = null;
		OutputStreamWriter out = null;
		
		try {
			fos = new FileOutputStream("e:\\gangsa\\outStrWrt.txt");
			out = new OutputStreamWriter(fos, "UTF -8");
			
			out.write(str);
			out.flush();//찌거기 내보내기
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos != null) try {fos.close();}catch(IOException e) {e.printStackTrace();}
			if(out != null) try {out.close();}catch(IOException e) {e.printStackTrace();}
			if(sc != null) try {sc.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		
		
		
		
		
		
	}
}
