package juls.springframework.petclinic.services.map;

import juls.springframework.petclinic.model.Vet;
import juls.springframework.petclinic.services.CrudService;
import juls.springframework.petclinic.services.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {

    }

    @Override
    public Vet save(Vet obj) {
        return null;
    }
}
