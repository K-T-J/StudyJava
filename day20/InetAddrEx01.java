package day20;

import java.net.InetAddress;
import java.net.URL;

public class InetAddrEx01 {
	public static void main(String[] args) throws Exception{

		
		//이런게 있구나 하고 넘어가자
		InetAddress[] addr1 = InetAddress.getAllByName("naver.com"); //id 주소 가져오는것
		InetAddress addr2 = InetAddress.getLocalHost(); // 내 ip 번호
		System.out.println(addr2.getHostAddress());//getHostAddress()ip만  // getHostName() 주소만
		
		for(InetAddress a : addr1) {
			System.out.println(a.getHostName());
			System.out.println(a.getHostAddress()); //네이버가 갖고있는 모은 ip 주소
		}
		
		System.out.println("----------------------------");
		
		
		String str = "https://post.naver.com/viewer/postView.nhn?volumeNo=31457635";
		URL url = new URL(str);
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트번호" + url.getPort());
		System.out.println("호스트" + url.getHost());
		System.out.println("내용" + url.getContent());
		
		
		
		
	}
}
