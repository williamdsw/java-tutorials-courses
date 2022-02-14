package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author William
 */

// JDBC
public class TableDefinitions {
    public TableDefinitions() {
    }

    public boolean createClubTable() {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" CREATE TABLE club ");
            query.append(" ( ");
            query.append(" id INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ");
            query.append(" name VARCHAR (100) NOT NULL, ");
            query.append(" position INT NOT NULL, ");
            query.append(" played INT NOT NULL, ");
            query.append(" won INT NOT NULL, ");
            query.append(" drawn INT NOT NULL, ");
            query.append(" lost INT NOT NULL, ");
            query.append(" goals_for INT NOT NULL, ");
            query.append(" goals_against INT NOT NULL, ");
            query.append(" goals_difference INT NOT NULL, ");
            query.append(" points INT NOT NULL, ");
            query.append(" last_changed TIMESTAMP NOT NULL ");
            query.append(" ) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                wasExecuted = (statement.executeUpdate() == 0);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean addTopScorerColumn() {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" ALTER TABLE club ");
            query.append(" ADD top_scorer VARCHAR (100) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                wasExecuted = (statement.executeUpdate() == 0);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean dropTopScorerColumn() {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" ALTER TABLE club ");
            query.append(" DROP COLUMN top_scorer ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                wasExecuted = (statement.executeUpdate() == 0);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean dropClubTable() {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" DROP TABLE club ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                wasExecuted = (statement.executeUpdate() == 0);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean createPlayerTable() {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" CREATE TABLE player ");
            query.append(" ( ");
            query.append(" id INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ");
            query.append(" club_id INT NOT NULL REFERENCES club (id), ");
            query.append(" name VARCHAR (200) NOT NULL, ");
            query.append(" position VARCHAR (100) NOT NULL, ");
            query.append(" nationality VARCHAR (100) NOT NULL, ");
            query.append(" birthdate DATE NOT NULL, ");
            query.append(" height DOUBLE NOT NULL, ");
            query.append(" weight DOUBLE NOT NULL, ");
            query.append(" goals_scored INT NOT NULL, ");
            query.append(" last_changed TIMESTAMP NOT NULL ");
            query.append(" ) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                wasExecuted = (statement.executeUpdate() == 0);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }
}