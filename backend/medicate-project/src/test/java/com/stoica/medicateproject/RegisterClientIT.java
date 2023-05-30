package com.stoica.medicateproject;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.TestPropertySource;

import com.stoica.medicateproject.domain.model.Client;
import com.stoica.medicateproject.domain.respoitory.ClientRepository;
import com.stoica.medicateproject.util.DatabaseCleaner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.springframework.http.HttpStatus;
import org.junit.jupiter.api.Assertions;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegisterClientIT {

	@LocalServerPort
	private int port;
	
//	@Autowired
//	private DatabaseCleaner databaseCleaner;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@BeforeEach
	public void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.port = port;
		RestAssured.basePath = "/clients";
		dataTest();
		// jsoncorrect
	}
	
	
	@Test
	void returnStatus200_whenListingClients () {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.given()
					.accept(ContentType.JSON)
					.when()
					.get()
					.then()
					.statusCode(HttpStatus.OK.value());
	}
	
	
	void dataTest() {
		Client client1 = new Client();
		client1.setCpf("12312312312");
		client1.setName("Ariel donato");
		
	}
	
}
