package personal.project.beercanoutlook.persistence;

import java.util.List;

import personal.project.beercanoutlook.objects.Brewery;

public interface IBrewery {

    boolean create(Brewery brewery);
    Brewery getByID(int id);
    List<Brewery> getAll();
    boolean update(Brewery brewery);
    boolean delete(Brewery brewery);

}
