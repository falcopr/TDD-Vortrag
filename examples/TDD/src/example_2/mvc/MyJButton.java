package example_2.mvc;

import java.awt.event.ActionListener;

import javax.swing.*;
import example_2.mvc.interfaces.IMyJButton;

public class MyJButton extends JButton implements IMyJButton{
	private static final long serialVersionUID = 1L;

	public void addActionListener(ActionListener al)
	{
		super.addActionListener(al);
	}
}
