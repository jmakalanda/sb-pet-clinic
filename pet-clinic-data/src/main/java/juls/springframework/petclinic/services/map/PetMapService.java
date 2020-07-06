package juls.springframework.petclinic.services.map;

import juls.springframework.petclinic.model.Pet;
import juls.springframework.petclinic.services.CrudService;
import juls.springframework.petclinic.services.PetService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj);
    }
}
