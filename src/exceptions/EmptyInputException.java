package exceptions;

public class EmptyInputException extends RuntimeException{
    public EmptyInputException(){
        super("Invalid input ! ");
    }
}
