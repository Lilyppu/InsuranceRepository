package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstCoy;
import com.Insurance.Repository.IInscMstCoyRepository;

@Service
public class ServiceInscMstCoy {
	
	@Autowired
	IInscMstCoyRepository repoInscMstCoy;
	
	public List<InscMstCoy> getInscMstCoyList(){
		return repoInscMstCoy.findAll();
	}
	
	public List<InscMstCoy> getInscMstCoyByCoyId(String CoyId){
		return repoInscMstCoy.findByImcCoyId(CoyId);
	}

}
