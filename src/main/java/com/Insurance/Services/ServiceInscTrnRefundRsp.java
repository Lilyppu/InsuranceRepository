package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnRefundRsp;
import com.Insurance.Repository.IInscTrnRefundRspRepository;

@Service
public class ServiceInscTrnRefundRsp {
	@Autowired
	IInscTrnRefundRspRepository repoITRR;
	
	public List<InscTrnRefundRsp> getItrrAll(){
		return repoITRR.findAll();
	}
	
	public Optional<InscTrnRefundRsp> getItrrByRefundNoCU(String refundno){
		return repoITRR.findByItrrRefundNo(refundno);
	}
}
