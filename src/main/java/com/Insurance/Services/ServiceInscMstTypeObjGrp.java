package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstTypeObjGrp;
import com.Insurance.Repository.IInscMstTypeObjGrpRepository;

@Service
public class ServiceInscMstTypeObjGrp {
	@Autowired
	IInscMstTypeObjGrpRepository repoIMTOG;
	
	public List<InscMstTypeObjGrp> getImtogAll(){
		return repoIMTOG.findAll();
	}
	
	public List<InscMstTypeObjGrp> getImtogByTypeIdList(String typeid){
		return repoIMTOG.findByImtogTypeIdContaining(typeid);
	}
}
