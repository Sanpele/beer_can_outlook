package personal.project.beercanoutlook.persistence;

import java.util.List;

import personal.project.beercanoutlook.objects.Beer;

public interface IBeer {

    boolean create(Beer beer);
    Beer getByID(int id);
    List<Beer> getAll();
    boolean update(Beer beer);
    boolean delete(Beer beer);

}
