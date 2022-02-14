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
public class InsertExample {
    private final Connection CONNECTION;

    public InsertExample() {
        CONNECTION = new ConnectionExample().getConnection();
    }

    /**
     * Insert one or more records on database
     * 
     * @param teams
     * @return
     * @throws java.sql.SQLException
     */
    public boolean insert(List<Team> teams) throws SQLException {
        boolean executed = false;

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" INSERT INTO team ");
        query.append(" (name, city, country, year_foundation, stadium, last_changed) ");
        query.append(" VALUES ");
        query.append(" (?, ?, ?, ?, ?, ?) ");

        try (PreparedStatement statement = CONNECTION.prepareStatement(query.toString())) {
            for (Team team : teams) {
                // Set parameters
                statement.setString(1, team.getName());
                statement.setString(2, team.getCity());
                statement.setString(3, team.getCountry());
                statement.setInt(4, team.getYearFoundation());
                statement.setString(5, team.getStadium());
                statement.setTimestamp(6, team.getLastChanged());
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

    // Example of multiples inserts
    public static void main(String[] args) {
        try {
            // Data
            Team liverpool = new Team();
            liverpool.setName("Liverpool");
            liverpool.setCity("Liverpool");
            liverpool.setCountry("England");
            liverpool.setYearFoundation(1892);
            liverpool.setStadium("Anfield");
            liverpool.setLastChanged(new Timestamp(System.currentTimeMillis()));

            Team milan = new Team();
            milan.setName("AC Milan");
            milan.setCity("Milan");
            milan.setCountry("Italy");
            milan.setYearFoundation(1889);
            milan.setStadium("Giuseppe Meazza");
            milan.setLastChanged(new Timestamp(System.currentTimeMillis()));

            Team realMadrid = new Team();
            realMadrid.setName("Real Madrid");
            realMadrid.setCity("Madrid");
            realMadrid.setCountry("Spain");
            realMadrid.setYearFoundation(1902);
            realMadrid.setStadium("Santiago Bernabeu");
            realMadrid.setLastChanged(new Timestamp(System.currentTimeMillis()));

            Team ajax = new Team();
            ajax.setName("AFC Ajax");
            ajax.setCity("Amsterdam");
            ajax.setCountry("Netherlands");
            ajax.setYearFoundation(1892);
            ajax.setStadium("Amsterdam ArenA");
            ajax.setLastChanged(new Timestamp(System.currentTimeMillis()));

            // List
            List<Team> teams = new ArrayList<Team>();
            teams.add(liverpool);
            teams.add(milan);
            teams.add(realMadrid);
            teams.add(ajax);

            InsertExample example = new InsertExample();
            boolean executed = example.insert(teams);
            System.out.println((executed ? "Teams inserted" : "Failed to insert"));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}