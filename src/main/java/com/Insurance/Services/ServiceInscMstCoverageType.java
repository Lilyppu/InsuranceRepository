package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstCoverageType;
import com.Insurance.Repository.IInscMstCoverageTypeRepository;

@Service
public class ServiceInscMstCoverageType {
	@Autowired
	IInscMstCoverageTypeRepository repoIMCT;
	
	public List<InscMstCoverageType> getImctAll(){
		return repoIMCT.findAll();
	}
	
	public Optional<InscMstCoverageType> getImctByCoverageIdCU(String coverageid){
		return repoIMCT.findByImctCoverageId(coverageid);
	}
}
