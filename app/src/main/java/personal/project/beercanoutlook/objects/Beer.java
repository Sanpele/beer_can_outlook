package personal.project.beercanoutlook.objects;

import java.util.ArrayList;

import personal.project.beercanoutlook.R;

public class Beer {

    private static int id;
    private int personalID;
    private String name;

    private String type;
    private Brewery owner;
    private ArrayList<String> description;
    private int logo;

    public Beer(String name, String type) {
        this.personalID = Beer.id;
        Beer.id++;
        this.name = name;
        this.type = type;
        this.owner = null;
        this.description = new ArrayList<>();
        logo = R.mipmap.ic_launcher;
    }

    public Beer update(Beer beer) {
        if (beer.getId() != this.personalID)
            return null;

        this.name = beer.getName();
        this.logo = beer.getLogo();
        this.type = beer.getType();
        this.owner = beer.getOwner();

        if (!this.description.equals(beer.getDescription()))
            this.description = beer.getDescription();
        return this;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Brewery getOwner() {
        return owner;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public int getLogo() {
        return logo;
    }

    public static int getId() {
        return id;
    }

    public void setOwner(Brewery owner) {
        this.owner = owner;
    }

    public void addDescription(String description) {
        this.description.add(description);
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

}
