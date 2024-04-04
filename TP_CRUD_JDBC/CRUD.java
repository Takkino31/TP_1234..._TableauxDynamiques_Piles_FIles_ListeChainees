import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * CRUD
 */
public class CRUD {

    Connection connection = ConnexionDB.getConnection();


    public void create(String firstname, String lastname, int age) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO Etudiant (nom,prenom, age) VALUES (?, ?, ?)");
            
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();
            System.out.println("Etudiant créé avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Etudiant");
            ResultSet results = preparedStatement.executeQuery();
            while (results.next()) {
                System.out.println("ID: " + results.getInt("id") + "\n" +
                        ", Nom: " + results.getString("nom") + "\n" +
                        ", Prénom: " + results.getString("prenom") + "\n" +
                        ", Age: " + results.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void read(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Etudiant WHERE id = ?");
            ResultSet results = preparedStatement.executeQuery();
            while (results.next()) {
                System.out.println("ID: " + results.getInt("id") + "\n" +
                        ", Nom: " + results.getString("nom") + "\n" +
                        ", Prénom: " + results.getString("prenom") + "\n" +
                        ", Age: " + results.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void update(int id, String newNom, String newPrenom, int newAge) {
        try {
            PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE Etudiant SET nom = ?, prenom = ?, age = ? WHERE id = ?");
            preparedStatement.setString(1, newNom);
            preparedStatement.setString(2, newPrenom);
            preparedStatement.setInt(3, newAge);
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
            System.out.println("Étudiant supprimé avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.
                prepareStatement("DELETE FROM Etudiant WHERE id = ?");
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}