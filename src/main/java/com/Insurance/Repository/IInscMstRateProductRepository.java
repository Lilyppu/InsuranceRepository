package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstRateProduct;
import com.Insurance.Models.InscMstRateProductCompKey;

import jakarta.transaction.Transactional;
public interface IInscMstRateProductRepository extends JpaRepository<InscMstRateProduct,InscMstRateProductCompKey>{
	
	public List<InscMstRateProduct> findByImrpCoyId(String coyid);

}
