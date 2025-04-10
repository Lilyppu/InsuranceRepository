package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnOrderIn;
import com.Insurance.Repository.IInscTrnOrderInRepository;

@Service
public class ServiceInscTrnOrderIn {
	@Autowired
	IInscTrnOrderInRepository repoITOI;
	
	public List<InscTrnOrderIn> getItoiAll(){
		return repoITOI.findAll();
	}
	
	public List<InscTrnOrderIn> getItoiByContractNoList(String contractno){
		return repoITOI.findByItoiContractNoContaining(contractno);
	}
}
