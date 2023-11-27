package com.example.APIRest.controllers;

import com.example.APIRest.entities.Client;
import com.example.APIRest.services.ClientServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/clients")
public class ClientController extends BaseControllerImpl<Client, ClientServiceImpl> {
}
