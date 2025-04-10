package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnOrderIn;
import com.Insurance.Models.InscTrnOrderInCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnOrderInRepository extends JpaRepository<InscTrnOrderIn,InscTrnOrderInCompKey>{
	
	public List<InscTrnOrderIn> findByItoiContractNoContaining(String contractno);
}
