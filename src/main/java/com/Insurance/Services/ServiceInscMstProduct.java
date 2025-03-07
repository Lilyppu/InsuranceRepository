package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstProduct;
import com.Insurance.Repository.IInscMstProductRepository;

@Service
public class ServiceInscMstProduct {
	@Autowired
	IInscMstProductRepository repoIMPR;
	
	public List<InscMstProduct> getImprAll(){
		return repoIMPR.findAll();
	}
	
	public Optional<InscMstProduct> getImprByProductNoCU(String productno){
		return repoIMPR.findByImprProductNo(productno);
	}
}
