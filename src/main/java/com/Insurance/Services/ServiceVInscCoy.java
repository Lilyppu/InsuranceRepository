package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.VInscCoy;
import com.Insurance.Repository.IVInscCoyRepository;

@Service
public class ServiceVInscCoy {
	
	@Autowired
	IVInscCoyRepository repoVinsCoy;
	
	public List<VInscCoy> getVinsCoyList(){
		return repoVinsCoy.findAll();
	}
	
	public List<VInscCoy> getVicVinsCoyId(String InsCoyId){
		return repoVinsCoy.findByvicVinscoyId(InsCoyId);
	}

}
