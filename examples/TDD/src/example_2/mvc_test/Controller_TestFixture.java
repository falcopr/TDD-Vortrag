package example_2.mvc_test;

import java.awt.event.ActionListener;

import org.junit.*;
import org.mockito.*;

import example_2.mvc.Container;
import example_2.mvc.Controller;
import example_2.mvc.interfaces.*;

public class Controller_TestFixture {
	@Mock protected IView viewMock;
	@Mock protected IModel modelMock;
	@Mock protected IMyJFrame frameMock;
	@Mock protected IMyJButton buttonMock;
	
	@Before public void SetUp()
	{
		viewMock = Mockito.mock(IView.class);
		modelMock = Mockito.mock(IModel.class);
		frameMock = Mockito.mock(IMyJFrame.class);
		buttonMock = Mockito.mock(IMyJButton.class);
		
		Container container = Container.getContainer();
		container.addComponent(IView.class, viewMock);
		container.addComponent(IModel.class, modelMock);
		
		Mockito.when(viewMock.getJButton()).thenReturn(buttonMock);
		Mockito.when(viewMock.getJFrame()).thenReturn(frameMock);
	}
	
	@Test public void Controller_ShouldAddActionlistenerToButtonOfViewAndSetVisibilityOfItsFrame_FrameIsVisibleAndOneActionListenerIsSetToButton()
	{
		//Method to test
		new Controller();
		
		Mockito.verify(viewMock, Mockito.times(1)).getJButton();
		Mockito.verify(viewMock, Mockito.times(1)).getJFrame();
		
		Mockito.verify(buttonMock, Mockito.times(1)).addActionListener(Mockito.any(ActionListener.class));
		Mockito.verify(frameMock, Mockito.times(1)).setVisible(true);
	}
}