package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnContDtls;
import com.Insurance.Repository.IInscTrnContDtlsRepository;

@Service
public class ServiceInscTrnContDtls {
	
	@Autowired
	IInscTrnContDtlsRepository repoItcd;
	
	public List<InscTrnContDtls> getContDtlsList(){
		return repoItcd.findAll();
	}
	
	public List<InscTrnContDtls> getContDtlsListByApplNo(String ApplNo){
		return repoItcd.findByItcdApplNo(ApplNo);
	}

}
