package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author William
 */

// JDBC
public class ClubDAO {

    public ClubDAO() {
    }

    public boolean insertClub(Club club) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" INSERT INTO club ");
            query.append(" ( name, position, played, won, drawn, lost, ");
            query.append(" goals_for, goals_against, goals_difference, points, last_changed ) ");
            query.append(" VALUES ");
            query.append(" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setString(1, club.getName());
                statement.setInt(2, club.getPosition());
                statement.setInt(3, club.getPlayed());
                statement.setInt(4, club.getWon());
                statement.setInt(5, club.getDrawn());
                statement.setInt(6, club.getLost());
                statement.setInt(7, club.getGoalsFor());
                statement.setInt(8, club.getGoalsAgainst());
                statement.setInt(9, club.getGoalsDifference());
                statement.setInt(10, club.getPoints());
                statement.setTimestamp(11, club.getLastChanged());

                wasExecuted = (statement.executeUpdate() == 1);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean insertClubs(List<Club> clubs) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" INSERT INTO club ");
            query.append(" ( name, position, played, won, drawn, lost, ");
            query.append(" goals_for, goals_against, goals_difference, points, last_changed ) ");
            query.append(" VALUES ");
            query.append(" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                for (Club club : clubs) {
                    statement.setString(1, club.getName());
                    statement.setInt(2, club.getPosition());
                    statement.setInt(3, club.getPlayed());
                    statement.setInt(4, club.getWon());
                    statement.setInt(5, club.getDrawn());
                    statement.setInt(6, club.getLost());
                    statement.setInt(7, club.getGoalsFor());
                    statement.setInt(8, club.getGoalsAgainst());
                    statement.setInt(9, club.getGoalsDifference());
                    statement.setInt(10, club.getPoints());
                    statement.setTimestamp(11, club.getLastChanged());
                    statement.addBatch();
                }

                wasExecuted = (statement.executeUpdate() == clubs.size());
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean updateClub(Club club) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" UPDATE club ");
            query.append(" SET position = ?, ");
            query.append(" played = ?, ");
            query.append(" won = ?, ");
            query.append(" drawn = ?, ");
            query.append(" lost = ?, ");
            query.append(" goals_for = ?, ");
            query.append(" goals_against = ?, ");
            query.append(" goals_difference = ?, ");
            query.append(" points = ?, ");
            query.append(" last_changed = ? ");
            query.append(" WHERE name = ? ");
            query.append(" AND id = ? ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, club.getPosition());
                statement.setInt(2, club.getPlayed());
                statement.setInt(3, club.getWon());
                statement.setInt(4, club.getDrawn());
                statement.setInt(5, club.getLost());
                statement.setInt(6, club.getGoalsFor());
                statement.setInt(7, club.getGoalsAgainst());
                statement.setInt(8, club.getGoalsDifference());
                statement.setInt(9, club.getPoints());
                statement.setTimestamp(10, club.getLastChanged());
                statement.setString(11, club.getName());
                statement.setInt(12, club.getId());

                wasExecuted = (statement.executeUpdate() == 1);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean deleteClub(Integer id) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" DELETE FROM club ");
            query.append(" WHERE id = ? ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, id);
                wasExecuted = (statement.executeUpdate() == 1);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public List<Club> listAllClubs() {
        List<Club> clubs = new ArrayList<>();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM club ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Club club = new Club();
                        club.setId(resultSet.getInt("ID"));
                        club.setName(resultSet.getString("NAME"));
                        club.setPosition(resultSet.getInt("POSITION"));
                        club.setPlayed(resultSet.getInt("PLAYED"));
                        club.setWon(resultSet.getInt("WON"));
                        club.setDrawn(resultSet.getInt("DRAWN"));
                        club.setLost(resultSet.getInt("LOST"));
                        club.setGoalsFor(resultSet.getInt("GOALS_FOR"));
                        club.setGoalsAgainst(resultSet.getInt("GOALS_AGAINST"));
                        club.setGoalsDifference(resultSet.getInt("GOALS_DIFFERENCE"));
                        club.setPoints(resultSet.getInt("POINTS"));
                        club.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                        clubs.add(club);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return clubs;
    }

    public List<Club> listClubsByName(String name) {
        List<Club> clubs = new ArrayList<>();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM club ");
            query.append(" WHERE name LIKE ? ");
            query.append(" ORDER BY name ASC ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setString(1, "%" + name + "%");

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Club club = new Club();
                        club.setId(resultSet.getInt("ID"));
                        club.setName(resultSet.getString("NAME"));
                        club.setPosition(resultSet.getInt("POSITION"));
                        club.setPlayed(resultSet.getInt("PLAYED"));
                        club.setWon(resultSet.getInt("WON"));
                        club.setDrawn(resultSet.getInt("DRAWN"));
                        club.setLost(resultSet.getInt("LOST"));
                        club.setGoalsFor(resultSet.getInt("GOALS_FOR"));
                        club.setGoalsAgainst(resultSet.getInt("GOALS_AGAINST"));
                        club.setGoalsDifference(resultSet.getInt("GOALS_DIFFERENCE"));
                        club.setPoints(resultSet.getInt("POINTS"));
                        club.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                        clubs.add(club);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return clubs;
    }

    public Club getClubByID(Integer id) {
        Club club = new Club();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM club ");
            query.append(" WHERE id = ? ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, id);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        club.setId(resultSet.getInt("ID"));
                        club.setName(resultSet.getString("NAME"));
                        club.setPosition(resultSet.getInt("POSITION"));
                        club.setPlayed(resultSet.getInt("PLAYED"));
                        club.setWon(resultSet.getInt("WON"));
                        club.setDrawn(resultSet.getInt("DRAWN"));
                        club.setLost(resultSet.getInt("LOST"));
                        club.setGoalsFor(resultSet.getInt("GOALS_FOR"));
                        club.setGoalsAgainst(resultSet.getInt("GOALS_AGAINST"));
                        club.setGoalsDifference(resultSet.getInt("GOALS_DIFFERENCE"));
                        club.setPoints(resultSet.getInt("POINTS"));
                        club.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return club;
    }
}