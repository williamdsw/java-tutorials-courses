package jdbc;

import java.sql.Timestamp;

/**
 * @author William
 */

// JDBC
public class Club {

    private Integer Id;
    private String name;
    private Integer position;
    private Integer played;
    private Integer won;
    private Integer drawn;
    private Integer lost;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer goalsDifference;
    private Integer points;
    private Timestamp lastChanged;

    public Club() {
    }

    public Club(Integer Id, String name, Integer position, Integer played, Integer won, Integer drawn, Integer lost,
            Integer goalsFor, Integer goalsAgainst, Integer goalsDifference, Integer points, Timestamp lastChanged) {
        this.Id = Id;
        this.name = name;
        this.position = position;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalsDifference = goalsDifference;
        this.points = points;
        this.lastChanged = lastChanged;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getDrawn() {
        return drawn;
    }

    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getGoalsDifference() {
        return goalsDifference;
    }

    public void setGoalsDifference(Integer goalsDifference) {
        this.goalsDifference = goalsDifference;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Timestamp getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(Timestamp lastChanged) {
        this.lastChanged = lastChanged;
    }
}