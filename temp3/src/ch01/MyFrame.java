package ch01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyFrame implements ActionListener {
	
	JButton button;
	
	public MyFrame() {
		
	}
	
	public void addEventListener() {
		button.addActionListener(this);
	}
	
	// 콜백 
	@Override
	public void actionPerformed(ActionEvent e) {
		// 메서드 호출 되어 졌다. 
	}

}
