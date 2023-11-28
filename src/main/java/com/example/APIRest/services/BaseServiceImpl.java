package com.example.APIRest.services;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import com.example.APIRest.mappers.BaseMapper;
import com.example.APIRest.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@NoRepositoryBean
public abstract class BaseServiceImpl<E extends Base, D extends BaseDTO, M extends BaseMapper<E, D>, ID extends Serializable> implements BaseService<E, D, ID> {

    protected BaseRepository<E, ID> baseRepository;
    @Autowired
    protected M modelMapper;

    protected BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<D> findAll() throws Exception {
        try {
            List<E> entities = baseRepository.findAll();
            List<D> dtos = new ArrayList<>();
            for (E entity : entities) {
                dtos.add(modelMapper.entityToDTO(entity));
            }
            return dtos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public D findById(ID id) throws Exception {
        try {
            Optional<E> entityOptional = baseRepository.findById(id);
            if (entityOptional.isEmpty()) {
                throw new NoSuchElementException("Couldn't find the entity");
            }
            E entity = entityOptional.get();
            return modelMapper.entityToDTO(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public D save(E entity) throws Exception {
        try {
            E savedEntity = baseRepository.save(entity);
            return modelMapper.entityToDTO(savedEntity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public D update(ID id, E entity) throws Exception {
        try {
            if (!baseRepository.existsById(id)) {
                throw new NoSuchElementException("Couldn't find the entity");
            }
            E updatedEntity = baseRepository.save(entity);
            return modelMapper.entityToDTO(updatedEntity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            baseRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
