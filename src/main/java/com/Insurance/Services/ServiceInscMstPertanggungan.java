package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscMstPertanggungan;
import com.Insurance.Repository.IInscMstPertanggunganRepository;

@Service
public class ServiceInscMstPertanggungan {
	
	@Autowired
	IInscMstPertanggunganRepository repoInscMstPertanggungan;
	
	public List<InscMstPertanggungan> getInscMstPertggList(){
		return repoInscMstPertanggungan.findAll();
	}
	
	public List<InscMstPertanggungan> getInscMstPertggByCoyId(String CoyId){
		return repoInscMstPertanggungan.findByImptgCoyId(CoyId);
	}
	
}
