package com.williamdsw.beans;

import java.io.Serializable;

/**
 *
 * @author William
 */
public class BandBean implements Serializable {
    // FIELDS

    private static final long serialVersionUID = 1L;
    private String name;
    private String genres;
    private Integer year;

    // CONSTRUCTOR

    public BandBean() {
    }

    public BandBean(String name, String genres, Integer year) {
        this.name = name;
        this.genres = genres;
        this.year = year;
    }

    // GETTERS - SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
