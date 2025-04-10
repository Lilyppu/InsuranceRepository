package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstStatOfClaim;
import com.Insurance.Repository.IInscMstStatOfClaimRepository;

@Service
public class ServiceInscMstStatOfClaim {
	@Autowired
	IInscMstStatOfClaimRepository repoIMSOC;
	
	public List<InscMstStatOfClaim> getImsocAll(){
		return repoIMSOC.findAll();
	}
	
	public List<InscMstStatOfClaim> getImsocByCoverageIdList(String coverageid){
		return repoIMSOC.findByImsocCoverageIdContaining(coverageid);
	}
}
