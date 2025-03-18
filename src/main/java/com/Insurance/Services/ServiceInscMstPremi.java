package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstPremi;
import com.Insurance.Repository.IInscMstPremiRepository;

@Service
public class ServiceInscMstPremi {
	
	@Autowired
	IInscMstPremiRepository repoInscMstPremi;
	
	public List<InscMstPremi> getInscMstPremiList(){
		return repoInscMstPremi.findAll();
	}

}
