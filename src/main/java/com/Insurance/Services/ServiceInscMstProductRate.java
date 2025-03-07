package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstProductRate;
import com.Insurance.Repository.IInscMstProductRateRepository;

@Service
public class ServiceInscMstProductRate {
	@Autowired
	IInscMstProductRateRepository repoIMPRT;
	
	public List<InscMstProductRate> getImprtAll(){
		return repoIMPRT.findAll();
	}
	
	public Optional<InscMstProductRate> getImprtByProductNoCU(String productno){
		return repoIMPRT.findByImprtProductNo(productno);
	}
}
