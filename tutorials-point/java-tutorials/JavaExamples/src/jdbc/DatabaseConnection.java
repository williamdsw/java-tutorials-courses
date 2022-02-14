package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author William
 */

// JDBC
public class DatabaseConnection {

    private final static String HOST = "localhost";
    private final static String DATABASE = "brasileirao2019";
    private final static String USER = "root";
    private final static String PASSWORD = "root";
    private final static int PORT = 1527;
    private final static String URL = "jdbc:derby://%s:%s/%s";
    private final static String JDBC_DRIVER_NAME = "org.apache.derby.jdbc.ClientDriver";
    private static Connection connection;

    public static Connection openConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER_NAME);
        connection = DriverManager.getConnection(formatStringConnection(), USER, PASSWORD);
        return connection;
    }

    private static String formatStringConnection() {
        return String.format(URL, HOST, PORT, DATABASE);
    }
}