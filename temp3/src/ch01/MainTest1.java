package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		ImageButton imageButton = new ImageButton();
		// 옵저버 패턴을 배워 보자 
		Button button = new Button("button1");
		// 인터페이스 --> 익명 클래스 --> 익명 구현 클래스 
		// 1 차 방식 
		button.setIButtonListener(imageButton);
		
		
		///////////////////// 설계 콜백 메서드 = 옵저버 패턴 
		// 오후 4시 됨 --> 알람 울림 
		button.click("야 너 집에 가야지! 엄마 기다려!!!");
		button.click("이게 정말 콜백이야");
		button.click("맞아 옵저버 패턴이라고도 불려");
	}

}
