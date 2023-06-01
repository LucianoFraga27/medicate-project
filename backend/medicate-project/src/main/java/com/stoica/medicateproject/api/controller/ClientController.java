package com.stoica.medicateproject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	@GetMapping("/all")
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/active")
	public List<Client> findActiveClients(){
		return clientRepository.findActiveClients();
	}
	
	@GetMapping("/inactive")
	public List<Client> findInativeClients(){
		return clientRepository.findInativeClients();
	}
	
	// need test
	@PostMapping
	public void addClient(@RequestBody Client client) {
		clientService.save(client);
	}
	
	// need test
	@GetMapping("/deactivatebyid/{id}")
	public void deactivateById (@PathVariable Long id) {
		clientService.deactivateById(id);
	}
	
	// need test
	@GetMapping("/deactivatebycpf/{cpf}")
	public void deactivateByCpf (@PathVariable String cpf) {
		clientService.deactivateByCpf(cpf);
	}
}
