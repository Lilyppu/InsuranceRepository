package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstKodePlat;
import com.Insurance.Repository.IInscMstKodePlatRepository;

@Service
public class ServiceInscMstKodePlat {
	@Autowired
	IInscMstKodePlatRepository repoIMKP;
	
	public List<InscMstKodePlat> getImkpAll(){
		return repoIMKP.findAll();
	}
	
	public Optional<InscMstKodePlat> getImkpByKodePlatCU(String kodeplat){
		return repoIMKP.findByImkpKodePlat(kodeplat);
	}
}
