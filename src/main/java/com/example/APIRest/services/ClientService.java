package com.example.APIRest.services;

import com.example.APIRest.entities.Client;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService extends BaseServiceImpl<Client, Long> {

    // Access to the ClientRepository methods
    @Autowired
    private ClientRepository clientRepository;

    protected ClientService(BaseRepository<Client, Long> baseRepository) {
        super(baseRepository);
    }
}
