package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstTop;
import com.Insurance.Repository.IInscMstTopRepository;

@Service
public class ServiceInscMstTop {
	
	@Autowired
	IInscMstTopRepository repoInscMstTop;
	
	public List<InscMstTop> getInscMstTopList(){
		return repoInscMstTop.findAll();
	}

}
