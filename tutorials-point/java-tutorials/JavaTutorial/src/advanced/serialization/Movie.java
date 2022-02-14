package advanced.serialization;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author William
 */

// SERIALIZATION
public class Movie implements Serializable {
    private String name;
    private LocalDate[] releaseDates;
    private transient Integer runningTime;
    private String[] countries;
    private String[] languages;
    private String[] genres;

    public Movie() {
    }

    public Movie(String name, LocalDate[] releaseDates, Integer runningTime, String[] countries, String[] languages,
            String[] genres) {
        this.name = name;
        this.releaseDates = releaseDates;
        this.runningTime = runningTime;
        this.countries = countries;
        this.languages = languages;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate[] getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(LocalDate[] releaseDates) {
        this.releaseDates = releaseDates;
    }

    public Integer getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Integer runningTime) {
        this.runningTime = runningTime;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
}