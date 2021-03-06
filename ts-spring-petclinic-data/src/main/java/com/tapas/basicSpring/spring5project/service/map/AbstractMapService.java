package com.tapas.basicSpring.spring5project.service.map;

import com.tapas.basicSpring.spring5project.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity,ID extends Long> {

    Map<Long,T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if(object!= null){
            if(object.getId()==null)
                object.setId(getNextId());
            map.put(object.getId(),object);
        }else
            throw new RuntimeException("Object cannot be null");
        return object;
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Long getNextId(){
        Long id = null;
        try{
            id = Collections.max(map.keySet())+1;
        }catch (Exception e){
            id = 1L;
        }
        return id;
    }
}
