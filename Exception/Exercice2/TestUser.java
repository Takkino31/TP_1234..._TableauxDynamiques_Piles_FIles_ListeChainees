
public class TestUser {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            User member = new User("Yaya", 30);
            System.out.println("Je me nomme : " + member.getNom() + " et j'ai " + member.getAge());

        } catch (UserException e) {
            /*TODO: handle exception*/
            
            e.IncorrectAge("L'age est incorrect");
            e.printStackTrace();
        }
    }

}

