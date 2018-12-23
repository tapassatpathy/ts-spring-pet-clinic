package com.tapas.basicSpring.spring5project.service.map;

import com.tapas.basicSpring.spring5project.model.Vet;
import com.tapas.basicSpring.spring5project.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
