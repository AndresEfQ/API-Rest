package com.example.APIRest.controllers;

import com.example.APIRest.dtos.BaseDTO;
import com.example.APIRest.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public interface BaseController<E extends Base> {

    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable Long id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable Long id);
}
