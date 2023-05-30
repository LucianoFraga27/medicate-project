package com.stoica.medicateproject.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stoica.medicateproject.domain.model.Client;
import com.stoica.medicateproject.domain.respoitory.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<?> findAll(){
		List<String> msg = new ArrayList();
		try {
			return clientRepository.findAll();
		} catch (Exception e) {
			msg.add("error");
			return msg;
		}
	} 
	
}
