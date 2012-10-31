package example_2.mvc;

import java.awt.BorderLayout;
import javax.swing.*;

import example_2.mvc.interfaces.IMyJButton;
import example_2.mvc.interfaces.IMyJFrame;
import example_2.mvc.interfaces.IMyJOptionPane;
import example_2.mvc.interfaces.IView;

public class View implements IView {
	
    private JPanel jContentPane = null;
    private MyJFrame jFrame = null;
    private MyJButton jButton = null;
    private MyJOptionPane jOptionPane = null;

    public View() {
        initialize();
    }

    private void initialize() {
        jButton = new MyJButton();
        jButton.setText("Klick Mich");
        
        jContentPane = new JPanel();
        jContentPane.setLayout(new BorderLayout());
        jContentPane.add(jButton, BorderLayout.CENTER);
        
    	jFrame = new MyJFrame();
        jFrame.setSize(300, 200);
        jFrame.setContentPane(jContentPane);
        jFrame.setTitle("JFrame");
        
        jOptionPane = new MyJOptionPane();
    }

    public IMyJButton getJButton() {
        return jButton;
    }
    
    public IMyJFrame getJFrame() {
    	return jFrame;
    }
    
    public IMyJOptionPane getJOptionPane(){
    	return jOptionPane;
    }
}