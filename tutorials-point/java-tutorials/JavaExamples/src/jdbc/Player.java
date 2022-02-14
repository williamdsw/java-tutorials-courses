package jdbc;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author William
 */

// JDBC
public class Player {
    private Integer Id;
    private Integer clubID;
    private String clubName;
    private String name;
    private String position;
    private String nationality;
    private Date birthdate;
    private Double height;
    private Double weight;
    private Integer goalsScored;
    private Timestamp lastChanged;

    public Player() {
    }

    public Player(Integer Id, Integer clubID, String clubName, String name, String position, String nationality,
            Date birthdate, Double height, Double weight, Integer goalsScored, Timestamp lastChanged) {
        this.Id = Id;
        this.clubID = clubID;
        this.clubName = clubName;
        this.name = name;
        this.position = position;
        this.nationality = nationality;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
        this.goalsScored = goalsScored;
        this.lastChanged = lastChanged;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getClubID() {
        return clubID;
    }

    public void setClubID(Integer clubID) {
        this.clubID = clubID;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Timestamp getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(Timestamp lastChanged) {
        this.lastChanged = lastChanged;
    }
}