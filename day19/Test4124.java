package day19;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test4124 {
	public static void main(String[] args) {

		byte [] b = {10, 20, 30, 40, 50, 60};
		
		try {
		FileOutputStream fi = new FileOutputStream("E:\\KTJ\\kim.out");
		
		for(int i = 0; i < b.length; i++) {
			fi.write(b[i]);
		}
		
		fi.write(b);
		
		
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
