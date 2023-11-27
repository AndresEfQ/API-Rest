package com.example.APIRest.repositories;

import com.example.APIRest.entities.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends BaseRepository<Client, Long> {
}
