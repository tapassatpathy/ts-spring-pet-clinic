package com.tapas.basicSpring.spring5project.service.map;

import com.tapas.basicSpring.spring5project.model.Owner;
import com.tapas.basicSpring.spring5project.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
}
