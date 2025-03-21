package com.Insurance.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnRefund;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnRefundRepository extends JpaRepository<InscTrnRefund,String>{
	
	public Optional<InscTrnRefund> findByItrRefundNo(String refundno);

}
