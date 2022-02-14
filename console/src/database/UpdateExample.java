package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author William
 */
public class UpdateExample {
    private final Connection CONNECTION;

    public UpdateExample() {
        CONNECTION = new ConnectionExample().getConnection();
    }

    /**
     * Update one or more records on database
     * 
     * @param teams
     * @return
     * @throws java.sql.SQLException
     */
    public boolean update(List<Team> teams) throws SQLException {
        boolean executed = false;

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" UPDATE team ");
        query.append(" SET name = ? ");
        query.append("     city = ?, ");
        query.append("     country = ?, ");
        query.append("     year_foundation = ?, ");
        query.append("     stadium = ?, ");
        query.append("     last_changed = ? ");
        query.append(" WHERE id = ? ");

        try (PreparedStatement statement = CONNECTION.prepareStatement(query.toString())) {
            for (Team team : teams) {
                // Set parameters
                statement.setString(1, team.getName());
                statement.setString(2, team.getCity());
                statement.setString(3, team.getCountry());
                statement.setInt(4, team.getYearFoundation());
                statement.setString(5, team.getStadium());
                statement.setTimestamp(6, team.getLastChanged());
                statement.setInt(7, team.getID());
                statement.addBatch();
            }

            // Result
            int[] affectedRows = statement.executeBatch();
            executed = (affectedRows.length == teams.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            CONNECTION.close();
        }

        return executed;
    }

    // Example of update
    public static void main(String[] args) {
        try {
            // Data
            Team team = new Team();
            team.setID(1); // see 'select' example
            team.setName("Manchester United");
            team.setCity("Manchester");
            team.setCountry("England");
            team.setYearFoundation(1878);
            team.setStadium("Old Trafford");
            team.setLastChanged(new Timestamp(System.currentTimeMillis()));

            // List
            List<Team> teams = new ArrayList<Team>();
            teams.add(team);

            UpdateExample example = new UpdateExample();
            boolean executed = example.update(teams);
            System.out.println((executed ? "Team updated" : "Failed to update"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}