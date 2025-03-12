package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstProductBranch;
import com.Insurance.Repository.IInscMstProductBranchRepository;

@Service
public class ServiceInscMstProductBranch {
	@Autowired
	IInscMstProductBranchRepository repoIMPB;
	
	public List<InscMstProductBranch> getImpbAll(){
		return repoIMPB.findAll();
	}
	
	public Optional<InscMstProductBranch> getImpbByProductNoCU(String productno){
		return repoIMPB.findByImpbProductNo(productno);
	}
}
