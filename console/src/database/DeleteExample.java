package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author William
 */
public class DeleteExample {
    private final Connection CONNECTION;

    public DeleteExample() {
        CONNECTION = new ConnectionExample().getConnection();
    }

    /**
     * Delete one or more records on database
     * 
     * @param IDs
     * @return
     * @throws java.sql.SQLException
     */
    public boolean delete(List<Integer> IDs) throws SQLException {
        boolean executed = false;

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" DELETE FROM team ");
        query.append(" WHERE id = ? ");

        try (PreparedStatement statement = CONNECTION.prepareStatement(query.toString())) {
            for (Integer id : IDs) {
                statement.setInt(1, id);
                executed = (statement.executeUpdate() == 1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            CONNECTION.close();
        }

        return executed;
    }

    // Tests command
    public static void main(String[] args) {
        try {
            // Data
            List<Integer> IDs = new ArrayList<>();
            IDs.add(1);
            IDs.add(2);
            IDs.add(3);

            DeleteExample example = new DeleteExample();
            boolean executed = example.delete(IDs);

            System.out.println((executed ? "Teams deleted" : "Failed to delete"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}