package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnPrepayInsc;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;

public interface IInscTrnPrepayInscRepository extends JpaRepository<InscTrnPrepayInsc,String>{
	
	public Optional<InscTrnPrepayInsc> findByItpiCertNo(String certno);

}
