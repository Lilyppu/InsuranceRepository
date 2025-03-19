package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnPremi;
import com.Insurance.Repository.IInscTrnPremiRepository;

@Service
public class ServiceInscTrnPremi {
	@Autowired
	IInscTrnPremiRepository repoITP;
	
	public List<InscTrnPremi> getItpAll(){
		return repoITP.findAll();
	}
	
	public Optional<InscTrnPremi> getItpByApplNoCU(String applno){
		return repoITP.findByItpApplNo(applno);
	}
}
