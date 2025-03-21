package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnRefundRsp;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnRefundRspRepository extends JpaRepository<InscTrnRefundRsp,String>{
	
	public Optional<InscTrnRefundRsp> findByItrrRefundNo(String refundno);

}
