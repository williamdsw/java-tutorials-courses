package jdbc;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author William
 */

// JDBC
public class ClubDemo {

    private static void insertClub() {
        // Data
        Club club = new Club();
        club.setName("Palmeiras");
        club.setPosition(2);
        club.setPlayed(35);
        club.setWon(15);
        club.setDrawn(10);
        club.setLost(10);
        club.setGoalsFor(50);
        club.setGoalsAgainst(45);
        club.setGoalsDifference(5);
        club.setPoints(55);
        club.setLastChanged(new Timestamp(System.currentTimeMillis()));

        ClubDAO clubDao = new ClubDAO();
        boolean wasInserted = clubDao.insertClub(club);

        // Output
        System.out.printf("%s %s inserted into CLUB \n", club.getName(), wasInserted ? "was" : "was not");
    }

    private static void updateClub() {
        // Data
        Club club = new Club();
        club.setId(2); // Check
        club.setName("Palmeiras");
        club.setPosition(2);
        club.setPlayed(35);
        club.setWon(16);
        club.setDrawn(10);
        club.setLost(9);
        club.setGoalsFor(55);
        club.setGoalsAgainst(48);
        club.setGoalsDifference(7);
        club.setPoints(58);
        club.setLastChanged(new Timestamp(System.currentTimeMillis()));

        ClubDAO clubDao = new ClubDAO();
        boolean wasUpdated = clubDao.updateClub(club);

        // Output
        System.out.printf("%s %s updated into CLUB \n", club.getName(), wasUpdated ? "was" : "was not");
    }

    private static void deleteClub() {
        // Data
        Club club = new Club();
        club.setId(2); // Check
        club.setName("Palmeiras");

        ClubDAO clubDao = new ClubDAO();
        boolean wasDeleted = clubDao.deleteClub(club.getId());

        // Output
        System.out.printf("%s %s deleted from CLUB \n", club.getName(), wasDeleted ? "was" : "was not");
    }

    private static void listAllClubs() {
        // Data
        ClubDAO clubDao = new ClubDAO();
        List<Club> clubs = clubDao.listAllClubs();

        // Output
        clubs.forEach((club) -> {
            printClubInformation(club);
        });
    }

    private static void listClubsByName() {
        // Data
        ClubDAO clubDao = new ClubDAO();
        List<Club> clubs = clubDao.listClubsByName("F");

        // Output
        clubs.forEach((club) -> {
            printClubInformation(club);
        });
    }

    private static void getClubByID() {
        // Data
        ClubDAO clubDao = new ClubDAO();
        Club club = clubDao.getClubByID(1); // Check

        // Output
        printClubInformation(club);
    }

    private static void printClubInformation(Club club) {
        System.out.println("----- CLUB -----");
        System.out.printf("ID: %s \n", club.getId());
        System.out.printf("Name: %s \n", club.getName());
        System.out.printf("Position: %s \n", club.getPosition());
        System.out.printf("Played: %s \n", club.getPlayed());
        System.out.printf("Won: %s \n", club.getWon());
        System.out.printf("Drawn: %s \n", club.getDrawn());
        System.out.printf("Lost: %s \n", club.getLost());
        System.out.printf("Goals For: %s \n", club.getGoalsFor());
        System.out.printf("Goals Against: %s \n", club.getGoalsAgainst());
        System.out.printf("Goals Difference: %s \n", club.getGoalsDifference());
        System.out.printf("Points: %s \n", club.getPoints());
        System.out.printf("Last Changed: %s \n", club.getLastChanged());
    }

    public static void main(String[] args) {
        // insertClub ();
        // updateClub ();
        listAllClubs();
        // listClubsByName ();
        // getClubByID ();
        // deleteClub ();
    }
}