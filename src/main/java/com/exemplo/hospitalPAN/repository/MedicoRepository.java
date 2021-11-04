package com.exemplo.hospitalPAN.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.exemplo.hospitalPAN.model.Agenda;


public interface MedicoRepository extends MongoRepository <Agenda,  String >{
			
}
