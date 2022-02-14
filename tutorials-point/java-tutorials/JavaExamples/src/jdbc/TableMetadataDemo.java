package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * @author William
 */

// JDBC
public class TableMetadataDemo {
    public static void showTableMetadata(String tableName) {
        try (Connection connection = DatabaseConnection.openConnection()) {
            String query = " SELECT * FROM %s ";
            query = String.format(query, tableName);

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.printf("\n----- %s COLUMNS ------\n", tableName);

                        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                            // Data
                            String name = resultSetMetaData.getColumnName(i);
                            String typeName = resultSetMetaData.getColumnTypeName(i);

                            // Output
                            System.out.printf("Column's name : %s \n", name);
                            System.out.printf("Column's type name : %s \n", typeName);
                        }
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {
        showTableMetadata("CLUB");
        showTableMetadata("PLAYER");
    }
}