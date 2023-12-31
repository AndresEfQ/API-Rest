package com.example.APIRest.repositories;

import com.example.APIRest.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends Base> extends JpaRepository<E, Long> {
}
