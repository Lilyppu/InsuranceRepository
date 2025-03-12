package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstCauseOfClaim;
import com.Insurance.Repository.IInscMstCauseOfClaimRepository;

@Service
public class ServiceInscMstCauseOfClaim {
	@Autowired
	IInscMstCauseOfClaimRepository repoIMCOC;
	
	public List<InscMstCauseOfClaim> getImcocAll(){
		return repoIMCOC.findAll();
	}
	
	public List<InscMstCauseOfClaim> getImcocByCoverageIdList(String coverageid){
		return repoIMCOC.findByImcocCoverageId(coverageid);
	}
}
