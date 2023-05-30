package com.stoica.medicateproject.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stoica.medicateproject.domain.exception.CpfAlreadyExistsException;
import com.stoica.medicateproject.domain.model.Client;
import com.stoica.medicateproject.domain.respoitory.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class RegisterClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional
	public void save(Client client) {
		clientRepository.findByCpf(client.getCpf())
		.ifPresent(c -> {
            throw new CpfAlreadyExistsException(c.getCpf());
            });
		clientRepository.save(client);
	}
	
	@Transactional
	public void delete(Long estadoId) {
		
	}
}
