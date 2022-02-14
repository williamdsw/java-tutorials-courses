package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author William
 */
public class SelectExamples {
    private final Connection CONNECTION;

    public SelectExamples() {
        CONNECTION = new ConnectionExample().getConnection();
    }

    /**
     * Select all records
     * 
     * @return
     * @throws SQLException
     */
    public List<Team> selectAll() throws SQLException {
        List<Team> teams = new ArrayList<>();

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" SELECT * FROM team ");

        try (PreparedStatement preparedStatement = CONNECTION.prepareStatement(query.toString())) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Fills
                    Team team = new Team();
                    team.setID(resultSet.getInt("id"));
                    team.setName(resultSet.getString("name"));
                    team.setCity(resultSet.getString("city"));
                    team.setCountry(resultSet.getString("country"));
                    team.setYearFoundation(resultSet.getInt("year_foundation"));
                    team.setStadium(resultSet.getString("stadium"));
                    team.setLastChanged(resultSet.getTimestamp("last_changed"));
                    teams.add(team);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            CONNECTION.close();
        }

        return teams;
    }

    /**
     * Select record count
     * 
     * @return
     * @throws SQLException
     */
    public Integer selectCount() throws SQLException {
        Integer count = 0;

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" SELECT COUNT (*) AS count FROM team ");

        try (PreparedStatement preparedStatement = CONNECTION.prepareStatement(query.toString())) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    count = resultSet.getInt("count");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            CONNECTION.close();
        }

        return count;
    }

    /**
     * Select one record by ID
     * 
     * @param id
     * @return
     * @throws SQLException
     */
    public Team selectById(Integer id) throws SQLException {
        Team team = null;

        // SQL
        StringBuilder query = new StringBuilder();
        query.append(" SELECT * FROM team ");
        query.append(" WHERE id = ? ");

        try (PreparedStatement preparedStatement = CONNECTION.prepareStatement(query.toString())) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Fills
                    team = new Team();
                    team.setID(resultSet.getInt("id"));
                    team.setName(resultSet.getString("name"));
                    team.setCity(resultSet.getString("city"));
                    team.setCountry(resultSet.getString("country"));
                    team.setYearFoundation(resultSet.getInt("year_foundation"));
                    team.setStadium(resultSet.getString("stadium"));
                    team.setLastChanged(resultSet.getTimestamp("last_changed"));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            CONNECTION.close();
        }

        return team;
    }

    // Examples of use
    public static void main(String[] args) {
        try {
            // All records
            System.out.println("\n\n##### TEAMS #####");

            SelectExamples examples = new SelectExamples();
            List<Team> teams = examples.selectAll();

            teams.forEach((team) -> {
                System.out.printf("ID: %d \n", team.getID());
                System.out.printf("Name: %s \n", team.getName());
                System.out.printf("City: %s \n", team.getCity());
                System.out.printf("Country: %s \n", team.getCountry());
                System.out.printf("Year of Foundation: %s \n", team.getYearFoundation());
                System.out.printf("Stadium: %s \n", team.getStadium());
                System.out.printf("Last Changed: %s \n", team.getLastChanged());
            });

            Thread.sleep(2000L);

            // Count
            System.out.println("\n\n##### COUNT #####");

            examples = new SelectExamples();
            Integer count = examples.selectCount();

            System.out.printf("Rows count: %d \n", count);

            Thread.sleep(2000L);

            // Record by ID
            System.out.println("\n\n##### RECORD BY ID #####");

            examples = new SelectExamples();
            Team team = examples.selectById(3);

            if (team != null) {
                System.out.printf("ID: %d \n", team.getID());
                System.out.printf("Name: %s \n", team.getName());
                System.out.printf("City: %s \n", team.getCity());
                System.out.printf("Country: %s \n", team.getCountry());
                System.out.printf("Year of Foundation: %s \n", team.getYearFoundation());
                System.out.printf("Stadium: %s \n", team.getStadium());
                System.out.printf("Last Changed: %s \n", team.getLastChanged());
            }
        } catch (SQLException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}