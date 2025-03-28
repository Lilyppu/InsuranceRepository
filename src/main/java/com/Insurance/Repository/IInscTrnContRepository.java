package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.InscTrnCont;
import com.Insurance.Models.InscTrnContCompKey;

@Repository
public interface IInscTrnContRepository extends JpaRepository<InscTrnCont,InscTrnContCompKey>{
	
	public List<InscTrnCont> findByItcApplNoAndItcApplSeqNoAndItcContractSeq(String ApplNo, Integer SeqNo, Integer ContSeq);

}
