package ch01;

public class ImageButton implements IButtonListener {

	@Override
	public void clickEvent(String event) {
		
		System.out.println("콜백 들어옴 : " + event);
		
	}

}
