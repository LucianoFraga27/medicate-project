package com.stoica.medicateproject.domain.respoitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stoica.medicateproject.domain.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
