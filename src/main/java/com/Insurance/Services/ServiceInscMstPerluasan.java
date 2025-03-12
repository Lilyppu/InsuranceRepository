package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstPerluasan;
import com.Insurance.Repository.IInscMstPerluasanRepository;

@Service
public class ServiceInscMstPerluasan {
	@Autowired
	IInscMstPerluasanRepository repoIMPAN;
	
	public List<InscMstPerluasan> getImpanAll(){
		return repoIMPAN.findAll();
	}
	
	public List<InscMstPerluasan> getImpanByCoyIdList(String coyid){
		return repoIMPAN.findByImpanCoyId(coyid);
	}
}
