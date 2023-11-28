package com.example.APIRest.services;

import com.example.APIRest.dtos.ClientDTO;
import com.example.APIRest.entities.Client;
import com.example.APIRest.mappers.ClientMapper;
import com.example.APIRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService extends BaseServiceImpl<Client, ClientDTO, ClientMapper, Long> {

    public ClientService(BaseRepository<Client, Long> baseRepository, ClientMapper clientMapper) {
        super(baseRepository);
        this.modelMapper = clientMapper;
    }
}
