package sam.spring.exception;

public class ControllerNotFoundException extends RuntimeException {

    public ControllerNotFoundException() {
        super("controller not found");
    }
}
