package jdbc;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author William
 */

// JDBC
public class PlayerDemo {
    private static void insertPlayer() {
        // Data
        Player player = new Player();
        player.setClubID(1); // Check
        player.setName("Zico");
        player.setPosition("Midfielder");
        player.setNationality("Brazil");
        player.setBirthdate(Date.valueOf("1999-01-01"));
        player.setHeight(1.83);
        player.setWeight(70.32);
        player.setGoalsScored(22);
        player.setLastChanged(new Timestamp(System.currentTimeMillis()));

        PlayerDAO playerDao = new PlayerDAO();
        boolean wasInserted = playerDao.insertPlayer(player);

        // Output
        System.out.printf("%s %s inserted into PLAYER \n", player.getName(), wasInserted ? "was" : "was not");
    }

    private static void updatePlayer() {
        // Data
        Player player = new Player();
        player.setId(1); // Check
        player.setClubID(1); // Check
        player.setName("Zico");
        player.setPosition("Midfielder");
        player.setNationality("Brazil");
        player.setHeight(1.75);
        player.setWeight(62.10);
        player.setGoalsScored(30);
        player.setLastChanged(new Timestamp(System.currentTimeMillis()));

        PlayerDAO playerDao = new PlayerDAO();
        boolean wasUpdated = playerDao.updatePlayer(player);

        // Output
        System.out.printf("%s %s updated into PLAYER \n", player.getName(), wasUpdated ? "was" : "was not");
    }

    private static void deletePlayer() {
        // Data
        Player player = new Player();
        player.setId(1); // Check
        player.setName("Zico");

        PlayerDAO playerDao = new PlayerDAO();
        boolean wasDeleted = playerDao.deletePlayer(player.getId());

        // Output
        System.out.printf("%s %s deleted from PLAYER \n", player.getName(), wasDeleted ? "was" : "was not");
    }

    private static void listAllPlayers() {
        // Data
        PlayerDAO playerDao = new PlayerDAO();
        List<Player> players = playerDao.listAllPlayers();

        // Output
        players.forEach((player) -> {
            printPlayerInformation(player);
        });
    }

    private static void listPlayersByName() {
        // Data
        PlayerDAO playerDao = new PlayerDAO();
        List<Player> players = playerDao.listPlayersByName("Z");

        // Output
        players.forEach((player) -> {
            printPlayerInformation(player);
        });
    }

    private static void listPlayersInnerClub() {
        // Data
        PlayerDAO playerDao = new PlayerDAO();
        List<Player> players = playerDao.listPlayerInnerClub();

        // Output
        players.forEach((player) -> {
            printPlayerInformation(player);
        });
    }

    private static void getPlayerByID() {
        // Data
        PlayerDAO playerDao = new PlayerDAO();
        Player player = playerDao.getPlayerByID(1); // Check

        // Output
        printPlayerInformation(player);
    }

    private static void printPlayerInformation(Player player) {
        System.out.println("----- PLAYER -----");
        System.out.printf("ID: %s \n", player.getId());
        System.out.printf("Name: %s \n", player.getName());

        if (player.getClubName() != null) {
            System.out.printf("Club: %s \n", player.getClubName());
        }

        System.out.printf("Position: %s \n", player.getPosition());
        System.out.printf("Nationality: %s \n", player.getNationality());
        System.out.printf("Birthdate: %s \n", player.getBirthdate());
        System.out.printf("Height: %s cm \n", player.getHeight());
        System.out.printf("Weight: %s kg \n", player.getWeight());
        System.out.printf("Goals Scored: %s \n", player.getGoalsScored());
        System.out.printf("Last Changed: %s \n", player.getLastChanged());
    }

    public static void main(String[] args) {
        // insertPlayer ();
        // updatePlayer ();
        // listAllPlayers ();
        // listPlayersByName ();
        listPlayersInnerClub();
        // getPlayerByID ();
        // deletePlayer ();
    }
}