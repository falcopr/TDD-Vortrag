package example_2.mvc;

import example_2.mvc.interfaces.*;

public class Model implements IModel
{
    private static final String message = "Ein einfaches TDD-Beispiel";

    public String getMessage() {
        return message;
    }
}