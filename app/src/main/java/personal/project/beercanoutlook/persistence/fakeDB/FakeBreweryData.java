package personal.project.beercanoutlook.persistence.fakeDB;

import java.util.ArrayList;
import java.util.List;

import personal.project.beercanoutlook.objects.Brewery;
import personal.project.beercanoutlook.persistence.IBrewery;

public class FakeBreweryData implements IBrewery {

    List<Brewery> breweryList;
    String [] breweryNames = {"Barn Hammer Brewing", "Brazen Hall Kitchen & Brewery", "Capital K Kistillery",
    "Dastardly Villian Brewery", "Devil May Care Brewing Company", "Farmery Estate Brewery",
    "Fort Garry Brewing Co.", "Good Neighbour Brewing Co.", "Half Pints Brewing Co.",
    "Kilter Brewing Co.", "La Brasserie Nonsuch Brewing Co.", "Lake of the Woods Brew Co."};

    public FakeBreweryData() {

        breweryList = new ArrayList<>();
        for (String curr : breweryNames)
            breweryList.add(new Brewery(curr));
    }

    @Override
    public boolean create(Brewery brewery) {
        breweryList.add(brewery);
        return breweryList.contains(brewery);
    }

    @Override
    public Brewery getByID(int id) {
        for (Brewery brew : breweryList)
            if (brew.getId() == id)
                return brew;
        return null;
    }

    @Override
    public List<Brewery> getAll() {
        return breweryList;
    }

    @Override
    public boolean update(Brewery brewery) {
        Brewery temp = null;
        for (Brewery brew : breweryList)
            if (brew.getId() == brewery.getId())
                temp = brew;
        temp.update(brewery);
        if (temp == null)
            return false;
        return true;
    }

    @Override
    public boolean delete(Brewery brewery) {
        return breweryList.remove(brewery);
    }
}
