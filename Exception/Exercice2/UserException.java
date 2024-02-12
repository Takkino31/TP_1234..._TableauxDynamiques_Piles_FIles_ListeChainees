
public class UserException extends Exception{

    UserException(String message){
        super(message);
    }
    
    public void IncorrectAge(String errorMessage){
        System.err.println("Takkino's Erreur Msg on Exception => " + errorMessage);
    }

}


