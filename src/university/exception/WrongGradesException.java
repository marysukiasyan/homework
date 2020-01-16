package university.exception;

public class WrongGradesException extends RuntimeException {
    public WrongGradesException(String message){
        super(message);
    }
}
