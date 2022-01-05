package excepctions;

public class ExceptionOpcionPagoNoEncontrada extends AssertionError{
    public ExceptionOpcionPagoNoEncontrada(String message,Throwable cause){
        super(message, cause);
    }
}
