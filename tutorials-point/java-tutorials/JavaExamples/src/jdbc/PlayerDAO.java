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
public class PlayerDAO {
    public PlayerDAO() {
    }

    public boolean insertPlayer(Player player) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" INSERT INTO player ");
            query.append(" ( club_id, name, position, nationality, ");
            query.append(" birthdate, height, weight, goals_scored, ");
            query.append(" last_changed ) ");
            query.append(" VALUES ");
            query.append(" (?, ?, ?, ?, ?, ?, ?, ?, ?) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, player.getClubID());
                statement.setString(2, player.getName());
                statement.setString(3, player.getPosition());
                statement.setString(4, player.getNationality());
                statement.setDate(5, player.getBirthdate());
                statement.setDouble(6, player.getHeight());
                statement.setDouble(7, player.getWeight());
                statement.setInt(8, player.getGoalsScored());
                statement.setTimestamp(9, player.getLastChanged());

                wasExecuted = (statement.executeUpdate() == 1);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean insertPlayers(List<Player> players) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" INSERT INTO player ");
            query.append(" ( club_id, name, position, nationality, ");
            query.append(" birthdate, height, weight, goals_scored, ");
            query.append(" last_changed ) ");
            query.append(" VALUES ");
            query.append(" (?, ?, ?, ?, ?, ?, ?, ?, ?) ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                for (Player player : players) {
                    statement.setInt(1, player.getClubID());
                    statement.setString(2, player.getName());
                    statement.setString(3, player.getPosition());
                    statement.setString(4, player.getNationality());
                    statement.setDate(5, player.getBirthdate());
                    statement.setDouble(6, player.getHeight());
                    statement.setDouble(7, player.getWeight());
                    statement.setInt(8, player.getGoalsScored());
                    statement.setTimestamp(9, player.getLastChanged());
                    statement.addBatch();
                }

                wasExecuted = (statement.executeUpdate() == players.size());
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean updatePlayer(Player player) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" UPDATE player ");
            query.append(" SET club_id = ?, ");
            query.append(" position = ?, ");
            query.append(" nationality = ?, ");
            query.append(" height = ?, ");
            query.append(" weight = ?, ");
            query.append(" goals_scored = ?, ");
            query.append(" last_changed = ? ");
            query.append(" WHERE name = ? ");
            query.append(" AND id = ? ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, player.getClubID());
                statement.setString(2, player.getPosition());
                statement.setString(3, player.getNationality());
                statement.setDouble(4, player.getHeight());
                statement.setDouble(5, player.getWeight());
                statement.setInt(6, player.getGoalsScored());
                statement.setTimestamp(7, player.getLastChanged());
                statement.setString(8, player.getName());
                statement.setInt(9, player.getId());

                wasExecuted = (statement.executeUpdate() == 1);
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return wasExecuted;
    }

    public boolean deletePlayer(Integer id) {
        boolean wasExecuted = false;

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" DELETE FROM player ");
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

    public List<Player> listAllPlayers() {
        List<Player> players = new ArrayList<>();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM player ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Player player = new Player();
                        player.setId(resultSet.getInt("ID"));
                        player.setClubID(resultSet.getInt("CLUB_ID"));
                        player.setName(resultSet.getString("NAME"));
                        player.setPosition(resultSet.getString("POSITION"));
                        player.setNationality(resultSet.getString("NATIONALITY"));
                        player.setBirthdate(resultSet.getDate("BIRTHDATE"));
                        player.setHeight(resultSet.getDouble("HEIGHT"));
                        player.setWeight(resultSet.getDouble("WEIGHT"));
                        player.setGoalsScored(resultSet.getInt("GOALS_SCORED"));
                        player.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                        players.add(player);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return players;
    }

    public List<Player> listPlayersByName(String name) {
        List<Player> players = new ArrayList<>();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM player ");
            query.append(" WHERE name LIKE ? ");
            query.append(" ORDER BY name ASC ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setString(1, "%" + name + "%");

                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Player player = new Player();
                        player.setId(resultSet.getInt("ID"));
                        player.setClubID(resultSet.getInt("CLUB_ID"));
                        player.setName(resultSet.getString("NAME"));
                        player.setPosition(resultSet.getString("POSITION"));
                        player.setNationality(resultSet.getString("NATIONALITY"));
                        player.setBirthdate(resultSet.getDate("BIRTHDATE"));
                        player.setHeight(resultSet.getDouble("HEIGHT"));
                        player.setWeight(resultSet.getDouble("WEIGHT"));
                        player.setGoalsScored(resultSet.getInt("GOALS_SCORED"));
                        player.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                        players.add(player);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return players;
    }

    public List<Player> listPlayerInnerClub() {
        List<Player> players = new ArrayList<>();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT club.name AS club_name, player.name AS player_name ");
            query.append(" FROM player AS player ");
            query.append(" INNER JOIN club AS club ");
            query.append(" ON (player.club_id = club.id) ");
            query.append(" ORDER BY club.name ASC ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        Player player = new Player();
                        player.setClubName(resultSet.getString("CLUB_NAME"));
                        player.setName(resultSet.getString("PLAYER_NAME"));
                        players.add(player);
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return players;
    }

    public Player getPlayerByID(Integer id) {
        Player player = new Player();

        try (Connection connection = DatabaseConnection.openConnection()) {
            StringBuilder query = new StringBuilder();
            query.append(" SELECT * FROM player ");
            query.append(" WHERE id = ? ");

            try (PreparedStatement statement = connection.prepareStatement(query.toString())) {
                statement.setInt(1, id);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        player.setId(resultSet.getInt("ID"));
                        player.setClubID(resultSet.getInt("CLUB_ID"));
                        player.setName(resultSet.getString("NAME"));
                        player.setPosition(resultSet.getString("POSITION"));
                        player.setNationality(resultSet.getString("NATIONALITY"));
                        player.setBirthdate(resultSet.getDate("BIRTHDATE"));
                        player.setHeight(resultSet.getDouble("HEIGHT"));
                        player.setWeight(resultSet.getDouble("WEIGHT"));
                        player.setGoalsScored(resultSet.getInt("GOALS_SCORED"));
                        player.setLastChanged(resultSet.getTimestamp("LAST_CHANGED"));
                    }
                }
            }
        } catch (SQLException | ClassNotFoundException exception) {
            System.out.println(exception);
        }

        return player;
    }
}