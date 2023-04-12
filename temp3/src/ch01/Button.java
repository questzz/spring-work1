package ch01;

/**
 * 1. 인터페이스가 필요하다. 
 * 2. 인터페이스를 컴포지션 관계(포함) 관계로 선언 한다. 
 * 3. setter(인터페이스 구현한 클래스들 받을) 메서드를 만들어 준다. 
 */
public class Button {
	
	private String name;
	private IButtonListener iButtonListener;
	
	public Button(String name) {
		this.name = name;
	}
	
	// setter 만들어서 주입 시킨다. 
	public void setIButtonListener(IButtonListener buttonListener) {
		this.iButtonListener = buttonListener;
	}
	
	public void click(String message) {
		if(iButtonListener != null) {
			this.iButtonListener.clickEvent(message);
		}
	}
}
