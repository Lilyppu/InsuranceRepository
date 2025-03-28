package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnOrderOut;
import com.Insurance.Repository.IInscTrnOrderOutRepository;

@Service
public class ServiceInscTrnOrderOut {
	@Autowired
	IInscTrnOrderOutRepository repoITOO;
	
	public List<InscTrnOrderOut> getItooAll(){
		return repoITOO.findAll();
	}
	
	public Optional<InscTrnOrderOut> getItooByContractNoCU(String contractno){
		return repoITOO.findByItooContractNo(contractno);
	}
}
