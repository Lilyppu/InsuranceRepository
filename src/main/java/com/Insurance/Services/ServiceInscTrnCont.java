package com.Insurance.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance.Models.InscTrnCont;
import com.Insurance.Repository.IInscTrnContRepository;

@Service
public class ServiceInscTrnCont {
	
	@Autowired
	IInscTrnContRepository repoInscTrnCont;
	
	public List<InscTrnCont> getInscTrnContList(){
		return repoInscTrnCont.findAll();
	}
	
	public List<InscTrnCont> getInsTrnContByApplNoApplSeqNoContSeq(String ApplNo, Integer SeqNo, Integer ContSeq){
		return repoInscTrnCont.findByItcApplNoAndItcApplSeqNoAndItcContractSeq(ApplNo, SeqNo, ContSeq);
	}

}
