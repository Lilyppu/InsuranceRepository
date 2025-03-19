package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnPrepayInsc;
import com.Insurance.Repository.IInscTrnPrepayInscRepository;

@Service
public class ServiceInscTrnPrepayInsc {
	@Autowired
	IInscTrnPrepayInscRepository repoITPI;
	
	public List<InscTrnPrepayInsc> getItpiAll(){
		return repoITPI.findAll();
	}
	
	public Optional<InscTrnPrepayInsc> getItpiByCertNoCU(String certno){
		return repoITPI.findByItpiCertNo(certno);
	}
}
