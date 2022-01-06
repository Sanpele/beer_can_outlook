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

    public Beer(String name, String type, Brewery owner) {
        this.personalID = Beer.id;
        Beer.id++;
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.description = new ArrayList<>();
        logo = R.mipmap.ic_launcher;
    }

    public void addDescription(String description) {
        this.description.add(description);
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

}
