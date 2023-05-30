package com.stoica.medicateproject.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Client {

	// In this case, the Client is the patient of the Doctor's Office.
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	// Considering that initially the project will be focused on a national scope,
	// the document used to identify the patient will be the CPF (Cadastro de Pessoa
	// Física), which is the individual taxpayer identification number in Brazil.
	
	private String cpf;
	
	private String name;
	
	private LocalDate birthDay;
	
	/*
	private String surname;
	private String sex;
	private Address address;
	private Phone phone;
	*/
}
