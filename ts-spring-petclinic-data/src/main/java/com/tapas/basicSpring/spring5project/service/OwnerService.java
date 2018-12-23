package com.tapas.basicSpring.spring5project.service;

import com.tapas.basicSpring.spring5project.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
