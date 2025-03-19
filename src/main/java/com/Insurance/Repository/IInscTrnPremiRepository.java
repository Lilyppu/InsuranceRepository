package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnPremi;
import com.Insurance.Models.InscTrnPremiCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnPremiRepository extends JpaRepository<InscTrnPremi,InscTrnPremiCompKey>{
	
	public Optional<InscTrnPremi> findByItpApplNo(String applno);

}
