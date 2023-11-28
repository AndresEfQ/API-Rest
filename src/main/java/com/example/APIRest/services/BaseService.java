package com.example.APIRest.services;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, D extends BaseDTO, ID extends Serializable> {
    public List<D> findAll() throws Exception;
    public D findById(ID id) throws Exception;
    public D save(E entity) throws Exception;
    public D update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
