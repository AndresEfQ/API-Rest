package com.example.APIRest.mappers;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;

public interface BaseMapper<E extends Base, D extends BaseDTO> {

    public D entityToDTO(E entity);
}
