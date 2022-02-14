package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author William
 */

// JDBC
public class DatabaseConnectionDemo {
    public static void main(String[] args) {
        try {
            try (Connection connection = DatabaseConnection.openConnection()) {
                boolean isOpen = !connection.isClosed();
                System.out.printf("Connection is %s! \n", isOpen ? "open" : "close");
                System.out.printf("Default schema: %s \n", connection.getSchema());
            }
        } catch (ClassNotFoundException | SQLException exception) {
            System.out.println(exception);
        }
    }
}