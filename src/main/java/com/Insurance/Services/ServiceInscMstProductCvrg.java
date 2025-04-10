package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstProductCvrg;
import com.Insurance.Repository.IInscMstProductCvrgRepository;

@Service
public class ServiceInscMstProductCvrg {
	@Autowired
	IInscMstProductCvrgRepository repoIMPCG;
	
	public List<InscMstProductCvrg> getImpcgAll(){
		return repoIMPCG.findAll();
	}
	
	public List<InscMstProductCvrg> getImpcgByProductNoList(String productno){
		return repoIMPCG.findByImpcgProductNoContaining(productno);
	}
}
