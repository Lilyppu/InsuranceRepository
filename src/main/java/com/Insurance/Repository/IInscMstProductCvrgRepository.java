package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstProductCvrg;
import com.Insurance.Models.InscMstProductCvrgCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscMstProductCvrgRepository extends JpaRepository<InscMstProductCvrg,InscMstProductCvrgCompKey>{
	
	public List<InscMstProductCvrg> findByImpcgProductNo(String productno);
}
