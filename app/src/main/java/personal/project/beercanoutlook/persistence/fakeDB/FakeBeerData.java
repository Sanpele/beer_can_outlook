package personal.project.beercanoutlook.persistence.fakeDB;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import personal.project.beercanoutlook.objects.Beer;
import personal.project.beercanoutlook.objects.Brewery;
import personal.project.beercanoutlook.persistence.IBeer;

public class FakeBeerData implements IBeer {

    private List<Beer> beerList;
    private String [][] beerStrings = {{"WHISKEY AMARETTO SOUR", "Sour"}, {"Monolithic No. 4","IPA"},
            {"Lousy Beatnik","Lager"}, {"GokStad IPA", "IPA"},{"Jarpur","Amber Ale"},{"Steel Cut","Blonde"},
            {"Sassy Af (as Freyja)","Radler"},{"Nefarious Plan \"A\"","Ale"},{"Diabolically Decadent","Ale"}};


    public FakeBeerData() {

        beerList = new ArrayList<>();
        for (String [] curr : beerStrings)
            beerList.add(new Beer(curr[0],curr[1]));

    }

    @Override
    public boolean create(Beer beer) {
        beerList.add(beer);
        return beerList.contains(beer);
    }

    @Override
    public Beer getByID(int id) {
        for (Beer curr : beerList)
            if (curr.getId() == id)
                return curr;
        return null;
    }

    @Override
    public List<Beer> getAll() {
        return beerList;
    }

    @Override
    public boolean update(Beer beer) {
        Beer temp = null;
        for (Beer curr : beerList)
            if (curr.getId() == beer.getId())
                temp = beer;
        temp.update(beer);
        if (temp == null)
            return false;
        return true;
    }

    @Override
    public boolean delete(Beer beer) {
        return beerList.remove(beer);
    }
}
