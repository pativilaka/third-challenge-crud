package com.vilaka.crudclient.controller;

import com.vilaka.crudclient.dto.ClientDTO;
import com.vilaka.crudclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO dto = service.findById(id);
        return dto;
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<ClientDTO> dto = service.findAll(pageable);
        return dto;
    }

    
}
