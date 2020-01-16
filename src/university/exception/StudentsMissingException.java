package university.exception;

public class StudentsMissingException extends RuntimeException {
    public StudentsMissingException(String message){
        super(message);
    }
}
