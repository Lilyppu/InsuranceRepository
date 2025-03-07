package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstProductRate;

import jakarta.transaction.Transactional;
public interface IInscMstProductRateRepository extends JpaRepository<InscMstProductRate,String>{
	
	public Optional<InscMstProductRate> findByImprtProductNo(String productno);
}
