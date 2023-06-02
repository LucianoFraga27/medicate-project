package com.stoica.medicateproject.domain.respoitory;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stoica.medicateproject.domain.model.MedicalAppointment;

public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointment, Long>{

	 @Query("SELECT ma FROM MedicalAppointment ma WHERE ma.dateTime > :currentDateTime")
     List<MedicalAppointment> getFutureAppointments(OffsetDateTime currentDateTime);
	
	 @Query("SELECT ma FROM MedicalAppointment ma WHERE ma.dateTime < :currentDateTime")
	 List<MedicalAppointment> getPastAppointments(OffsetDateTime currentDateTime);
	 
}
