package com.example.APIRest.mappers;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import org.modelmapper.ModelMapper;

public abstract class BaseMapperImp<E extends Base, D extends BaseDTO> implements BaseMapper<E, D> {

    protected ModelMapper modelMapper;


}
