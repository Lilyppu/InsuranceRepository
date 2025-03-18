package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstType;
import com.Insurance.Repository.IInscMstTypeRepository;

@Service
public class ServiceInscMstType {
	
	@Autowired
	IInscMstTypeRepository repoInscMstType;
	
	public List<InscMstType> getInscMstTypeList(){
		return repoInscMstType.findAll();
	}

}
