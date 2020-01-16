package university.exception;

public class GroupsMissingException extends RuntimeException   {
    public GroupsMissingException(String message){
        super(message);
    }
}
