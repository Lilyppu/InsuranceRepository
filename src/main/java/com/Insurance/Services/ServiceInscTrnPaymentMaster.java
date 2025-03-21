package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnPaymentMaster;
import com.Insurance.Repository.IInscTrnPaymentMasterRepository;

@Service
public class ServiceInscTrnPaymentMaster {
	@Autowired
	IInscTrnPaymentMasterRepository repoITPM;
	
	public List<InscTrnPaymentMaster> getItpmAll(){
		return repoITPM.findAll();
	}
	
	public Optional<InscTrnPaymentMaster> getItpmByGroupNoCU(String groupno){
		return repoITPM.findByItpmGroupNo(groupno);
	}
}
