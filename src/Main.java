//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cucinaalpina";
        String user = "root";
        String password = "root";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connesso con successo!");
        Statement stmt = conn.createStatement();
        String query = "SELECT persona.cognome, persona.nome FROM persona";
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("Cognome: " + rs.getString("cognome") + "\n" + rs.getString("nome"));

        }

        rs.close();
        stmt.close();
        conn.close();
    }
}