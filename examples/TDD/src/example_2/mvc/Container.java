package example_2.mvc;

import org.picocontainer.DefaultPicoContainer;

import example_2.mvc.interfaces.IModel;
import example_2.mvc.interfaces.IView;

public class Container extends DefaultPicoContainer {
	private static final long serialVersionUID = 5829357502174338255L;
	
	private static Container m_Container = new Container();
	
	public static Container getContainer()
	{
		return m_Container;
	}
	
	public static void initializeToProductiveConatiner()
	{
		m_Container.addComponent(IView.class, View.class);
		m_Container.addComponent(IModel.class, Model.class);
	}
}
