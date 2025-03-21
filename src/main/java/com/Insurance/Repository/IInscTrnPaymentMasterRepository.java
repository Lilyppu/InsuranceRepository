package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnPaymentMaster;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnPaymentMasterRepository extends JpaRepository<InscTrnPaymentMaster,String>{
	
	public Optional<InscTrnPaymentMaster> findByItpmGroupNo(String groupno);

}
