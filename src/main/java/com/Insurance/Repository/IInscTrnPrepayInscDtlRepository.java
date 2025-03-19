package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnPrepayInscDtl;
import com.Insurance.Models.InscTrnPrepayInscDtlCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnPrepayInscDtlRepository extends JpaRepository<InscTrnPrepayInscDtl,InscTrnPrepayInscDtlCompKey>{
	
	public Optional<InscTrnPrepayInscDtl> findByItpidCertNo(String certno);
}
