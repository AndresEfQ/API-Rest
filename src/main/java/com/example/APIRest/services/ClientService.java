package com.example.APIRest.services;

import com.example.APIRest.dtos.ClientDTO;
import com.example.APIRest.entities.Client;
import com.example.APIRest.mappers.ClientMapper;
import com.example.APIRest.repositories.BaseRepository;
import com.example.APIRest.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService extends BaseServiceImpl<Client, ClientDTO, ClientMapper> {


    public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
        super(clientRepository, clientMapper);
        this.modelMapper = clientMapper;
    }
}
