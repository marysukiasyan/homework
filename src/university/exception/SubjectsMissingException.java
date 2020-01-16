package university.exception;

public class SubjectsMissingException extends RuntimeException {
    public SubjectsMissingException(String message){
        super(message);
    }
}
