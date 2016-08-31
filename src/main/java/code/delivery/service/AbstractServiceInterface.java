package code.delivery.service;

import java.util.List;

/**
 * Created by joao on 30/08/16.
 */
public interface AbstractServiceInterface <T> {

    void save (T obj);

    void update (T obj);

    boolean delete (long id);

    List <T> list();

    T findById(long id);

}
