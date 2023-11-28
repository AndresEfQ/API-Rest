package com.example.APIRest.mappers;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public abstract class BaseMapperImp<E extends Base, D extends BaseDTO> implements BaseMapper<E, D> {

    ModelMapper modelMapper = new ModelMapper();
}
