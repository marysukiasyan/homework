package university.exception;

public class FacultiesMissingException extends RuntimeException {
    public FacultiesMissingException(String message){
        super(message);
    }
}
