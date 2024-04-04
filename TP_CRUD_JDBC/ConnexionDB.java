import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/School?";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    // Méthode pour obtenir la connexion à la base de données
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {

                // Charger le pilote JDBC MySQL
                // Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                // Établir une nouvelle connexion
                connection = DriverManager.getConnection(URL+"user="+ USERNAME + "password="+ PASSWORD);
                System.err.println("Connexion Successfull TAKKINO");
            }
        } catch ( SQLException e) {
            System.err.println("Connexion failed TAKKINO");
            e.printStackTrace();
        }
        return connection;
    }

    // Méthode pour fermer la connexion à la base de données
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
