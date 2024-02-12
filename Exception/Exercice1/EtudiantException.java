import java.lang.Exception;

public class EtudiantException extends Exception{
    EtudiantException(String message){
        super(message);
    }
    
    public void IncorrectNumber(String errorMessage){
        System.err.println("Erreur " +errorMessage);
    }
}
