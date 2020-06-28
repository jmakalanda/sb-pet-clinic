package juls.springframework.petclinic.services;

import juls.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByFirstName(String name);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
