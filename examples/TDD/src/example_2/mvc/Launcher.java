package example_2.mvc;

import example_2.mvc.Controller;

public class Launcher {
    public static void main(String[] args) 
    {
    	Container.initializeToProductiveConatiner();
        new Controller();
    }
}