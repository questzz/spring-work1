package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 중간 클래스 만들었음 ! 
		String url = "www.naver.com/books/id?=100";
		
		// IEncoder 생성자 타입 --> 의존 주입 설계 
		// Base64Encoder <-- IEncoder 타입으로 바라볼 수 있다.
		// URlEncoder <-- IEncoder 타입으로 바라볼 수 있다.
		
		// 하고싶은 인코더 클래스를 주입만 하면 그 구현 클래스에 맞게 
		// 기능을 처리할 수 있다. 
		
		Encoder encoder = new Encoder(new UrlEncoder());
		String result1 = encoder.encode(url);
		System.out.println("result1 : " + result1);
		
		encoder.setiEncoder(new Base64Encoder());
		System.out.println(encoder.encode("반가워"));
		
//		Encoder encoder2 = new Encoder(new Base64Encoder());
//		String result2 = encoder2.encode(url);
//		System.out.println("result2 : " + result2);
//		
//		Encoder encoder3 = new Encoder(new MyEncoder());
//		String result3 = encoder3.encode(url);
//		System.out.println("result3 : " + result3);
	}

}
