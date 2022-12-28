package co2103.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private int id;
    private String name;
    private String location;

    private List<Film> films = new ArrayList<Film>();


    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {return location;}

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(Film film) {
        films.add(film);
    }

}



