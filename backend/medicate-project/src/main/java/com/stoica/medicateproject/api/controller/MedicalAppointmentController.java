package com.stoica.medicateproject.api.controller;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stoica.medicateproject.domain.model.Client;
import com.stoica.medicateproject.domain.model.MedicalAppointment;
import com.stoica.medicateproject.domain.respoitory.MedicalAppointmentRepository;
import com.stoica.medicateproject.domain.service.MedicalApointmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/medicalappointment")
public class MedicalAppointmentController {
	
	@Autowired
	private MedicalAppointmentRepository medicalAppointmentRepository;
	
	@Autowired
	private MedicalApointmentService medicalAppointmentService;
	
	@GetMapping("/all")
	public List<MedicalAppointment> findAll(){
		return medicalAppointmentRepository.findAll();
	}
	
	@GetMapping("/future")
	public List<MedicalAppointment> getFutureAppointments(){
		return medicalAppointmentService.getFutureAppointments();
	}
	
	@GetMapping("/past")
	public List<MedicalAppointment> getPastAppointments(){
		return medicalAppointmentService.getPastAppointments();
	}
	
	@PostMapping("/add")
	public MedicalAppointment addMedicalAppointment(@RequestBody @Valid MedicalAppointment medicalAppointment) {
		return medicalAppointmentRepository.save(medicalAppointment);
	}
	
	/*
	@GetMapping("/confirmed")
	public List<MedicalAppointment> setStatusConfirmed(){
		return medicalAppointmentService.getPastAppointments();
	}
	
	@GetMapping("/canceled")
	public List<MedicalAppointment> setStatusCanceled(){
		return medicalAppointmentService.getPastAppointments();
	}
	*/
	
	/*@PutMapping("/remarked")
	public List<MedicalAppointment> setStatusRemarked(){
		return medicalAppointmentService.getPastAppointments();
	}*/
	
}
