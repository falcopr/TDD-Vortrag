package example_2.mvc;

import javax.swing.*;
import example_2.mvc.interfaces.IMyJFrame;

public class MyJFrame extends JFrame implements IMyJFrame{
	private static final long serialVersionUID = 1L;

	public void setVisible(boolean visible)
	{
		super.setVisible(visible);
	}
}
