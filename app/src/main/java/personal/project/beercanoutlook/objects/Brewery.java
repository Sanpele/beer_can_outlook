package personal.project.beercanoutlook.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;

import personal.project.beercanoutlook.R;

public class Brewery {

    private static int id;
    private int personalID;
    private String name;
    private ArrayList<Beer> beers;
    private String location;
    private int logo;

    public Brewery( String name) {
        this.personalID = Brewery.id;
        Brewery.id++;

        this.name = name;
        this.beers = new ArrayList<>();
        this.logo = R.mipmap.ic_launcher;

    }

    public Brewery(String name, String location, int logo) {
        this.personalID = Brewery.id;
        Brewery.id++;
        this.name = name;
        this.beers = new ArrayList<>();
        this.location = location;
        this.logo = logo;
    }

    public Brewery update(Brewery brew) {
        if (brew.getId() != this.personalID)
            return null;

        this.name = brew.getName();
        this.location = brew.getLocation();
        this.logo = brew.getLogo();
        if (!this.beers.equals(brew.getBeers()))
            this.beers = brew.getBeers();
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Beer> getBeers() {
        return beers;
    }

    public String getLocation() {
        return location;
    }

    public int getLogo() {
        return logo;
    }

}
