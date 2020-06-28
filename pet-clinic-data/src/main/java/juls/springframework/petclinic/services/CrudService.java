package juls.springframework.petclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {
    T findById(ID id);
    Set<T> findAll();
    T save(T obj);
    void delete(T obj);
}
