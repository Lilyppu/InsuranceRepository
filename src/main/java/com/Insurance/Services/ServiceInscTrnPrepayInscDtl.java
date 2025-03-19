package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnPrepayInscDtl;
import com.Insurance.Repository.IInscTrnPrepayInscDtlRepository;

@Service
public class ServiceInscTrnPrepayInscDtl {
	@Autowired
	IInscTrnPrepayInscDtlRepository repoITPID;
	
	public List<InscTrnPrepayInscDtl> getItpidAll(){
		return repoITPID.findAll();
	}
	
	public Optional<InscTrnPrepayInscDtl> getItpidByCertNoCU(String certno){
		return repoITPID.findByItpidCertNo(certno);
	}
}
