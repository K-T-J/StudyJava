package day18;

import java.util.Enumeration;
import java.util.Properties;

public class PropEx01 {
	public static void main(String[] args) {

		Properties p = new Properties();
		//k,v 저장	name	value
		p.setProperty("id", "global");
		p.setProperty("url", "nillmaster");
		p.setProperty("sid", "odlwd");
		p.setProperty("csq", "lfkwlq");
		
		
		// v 꺼내기
		String value = p.getProperty("id");
		System.out.println(value);
		
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + "=" + p.getProperty(key));
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
