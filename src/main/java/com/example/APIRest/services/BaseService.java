package com.example.APIRest.services;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, D extends BaseDTO> {
    public List<D> findAll() throws Exception;
    public D findById(Long id) throws Exception;
    public D save(E entity) throws Exception;
    public D update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
