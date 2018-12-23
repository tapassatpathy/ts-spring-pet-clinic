package com.tapas.basicSpring.spring5project.service.map;

import com.tapas.basicSpring.spring5project.model.Pet;
import com.tapas.basicSpring.spring5project.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
