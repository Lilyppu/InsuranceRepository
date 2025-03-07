package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstProduct;

import jakarta.transaction.Transactional;
public interface IInscMstProductRepository extends JpaRepository<InscMstProduct,String>{
	
	public Optional<InscMstProduct> findByImprProductNo(String productno);

}
