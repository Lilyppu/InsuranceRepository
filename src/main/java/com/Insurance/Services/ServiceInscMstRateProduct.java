package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstRateProduct;
import com.Insurance.Repository.IInscMstRateProductRepository;

@Service
public class ServiceInscMstRateProduct {
	@Autowired
	IInscMstRateProductRepository repoIMRP;
	
	public List<InscMstRateProduct> getImrpAll(){
		return repoIMRP.findAll();
	}
	
	public List<InscMstRateProduct> getImrpByCoyIdList(String coyid){
		return repoIMRP.findByImrpCoyId(coyid);
	}
}
