package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnKonfirmasi;
import com.Insurance.Repository.IInscTrnKonfirmasiRepository;

@Service
public class ServiceInscTrnKonfirmasi {
	@Autowired
	IInscTrnKonfirmasiRepository repoITK;
	
	public List<InscTrnKonfirmasi> getItkAll(){
		return repoITK.findAll();
	}
	
	public Optional<InscTrnKonfirmasi> getItkByContractNoCU(String contractno){
		return repoITK.findByItkContractNo(contractno);
	}
}
