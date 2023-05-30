package com.stoica.medicateproject.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stoica.medicateproject.domain.model.Client;
import com.stoica.medicateproject.domain.respoitory.ClientRepository;
import com.stoica.medicateproject.domain.service.RegisterClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private RegisterClientService clientService;
	
	@GetMapping
	public List<Client> findAll(){
		return clientRepository.findAll();
	} 
	
	@PostMapping
	public void addClient(@RequestBody Client client) {
		clientService.save(client);
	}
	
}
