package example_2.mvc;

import java.awt.Component;

import javax.swing.JOptionPane;

import example_2.mvc.interfaces.IMyJFrame;
import example_2.mvc.interfaces.IMyJOptionPane;

public class MyJOptionPane extends JOptionPane implements IMyJOptionPane{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("static-access")
	public void showMessage(IMyJFrame frame, String message){
		MyJOptionPane optionPane = new MyJOptionPane();
		optionPane.showMessageDialog((Component)frame, message);
	}
}
