package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnPaymentDtls;
import com.Insurance.Repository.IInscTrnPaymentDtlsRepository;

@Service
public class ServiceInscTrnPaymentDtls {
	@Autowired
	IInscTrnPaymentDtlsRepository repoITPD;
	
	public List<InscTrnPaymentDtls> getItpdAll(){
		return repoITPD.findAll();
	}
	
	public Optional<InscTrnPaymentDtls> getItpdByGroupNoCU(String groupno){
		return repoITPD.findByItpdGroupNo(groupno);
	}
}
