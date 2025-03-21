package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnPaymentDtls;
import com.Insurance.Models.InscTrnPaymentDtlsCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnPaymentDtlsRepository extends JpaRepository<InscTrnPaymentDtls,InscTrnPaymentDtlsCompKey>{
	
	public Optional<InscTrnPaymentDtls> findByItpdGroupNo(String groupno);

}
