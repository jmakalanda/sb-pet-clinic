package juls.springframework.petclinic.services;

import juls.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByFirstName(String name);
}
