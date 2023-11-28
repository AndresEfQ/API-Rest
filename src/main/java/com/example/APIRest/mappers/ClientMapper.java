package com.example.APIRest.mappers;

import com.example.APIRest.dtos.ClientDTO;
import com.example.APIRest.entities.Client;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper extends BaseMapperImp<Client, ClientDTO> implements BaseMapper<Client, ClientDTO> {

    @Override
    public ClientDTO entityToDTO(Client client) {
        return modelMapper.map(client, ClientDTO.class);
    }
}
