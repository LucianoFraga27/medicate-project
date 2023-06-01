package com.stoica.medicateproject.domain.respoitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stoica.medicateproject.domain.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

	Optional<Client> findByCpf(String cpf);
	
}
