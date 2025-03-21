package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnRefund;
import com.Insurance.Repository.IInscTrnRefundRepository;

@Service
public class ServiceInscTrnRefund {
	@Autowired
	IInscTrnRefundRepository repoITR;
	
	public List<InscTrnRefund> getItrAll(){
		return repoITR.findAll();
	}
	
	public Optional<InscTrnRefund> getItrByRefundNoCU(String productno){
		return repoITR.findByItrRefundNo(productno);
	}
}
