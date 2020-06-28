package juls.springframework.petclinic.services;

import juls.springframework.petclinic.model.Pet;
import juls.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
