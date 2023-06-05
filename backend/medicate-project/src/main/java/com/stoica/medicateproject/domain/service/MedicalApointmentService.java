package com.stoica.medicateproject.domain.service;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stoica.medicateproject.domain.model.MedicalAppointment;
import com.stoica.medicateproject.domain.respoitory.MedicalAppointmentRepository;

import jakarta.transaction.Transactional;

@Service
public class MedicalApointmentService {

	@Autowired
	private MedicalAppointmentRepository medicalAppointmentRepository;
	
	@Transactional
	public void createAppointmentById (Long id_client) {
		
	}
	
	@Transactional
	public void createAppointmentByCpf (String cpf) {
		
	}
		
	public  OffsetDateTime currentDateTime = OffsetDateTime.now();
	
	public List<MedicalAppointment> getFutureAppointments(){
		return medicalAppointmentRepository.getFutureAppointments(currentDateTime);
	}
	
	public List<MedicalAppointment> getPastAppointments(){
		return medicalAppointmentRepository.getPastAppointments(currentDateTime);
	}
}
