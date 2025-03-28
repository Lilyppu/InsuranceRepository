package com.Insurance.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance.Models.InscTrnOrderOut;
import com.Insurance.Models.InscTrnOrderOutCompKey;

public interface IInscTrnOrderOutRepository extends JpaRepository<InscTrnOrderOut,InscTrnOrderOutCompKey>{
	
	public Optional<InscTrnOrderOut> findByItooContractNo(String contractno);

}
