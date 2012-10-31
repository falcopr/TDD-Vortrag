package example_2.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import example_2.mvc.interfaces.IController;
import example_2.mvc.interfaces.IModel;
import example_2.mvc.interfaces.IMyJOptionPane;
import example_2.mvc.interfaces.IView;

public class Controller implements IController {

    private final IModel model;
    private final IView view;
    
    public Controller() 
    {
    	Container container = Container.getContainer();
    	view = container.getComponent(IView.class);
    	model = container.getComponent(IModel.class);
    	
        view.getJButton().addActionListener(getActionListener());  
        view.getJFrame().setVisible(true);
    }
    
    private ActionListener getActionListener()
    {
    	return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	IMyJOptionPane jOptionPane = view.getJOptionPane();
            	jOptionPane.showMessage(view.getJFrame(), model.getMessage());
            }           
        };
    }
}