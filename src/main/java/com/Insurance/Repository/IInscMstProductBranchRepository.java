package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstProductBranch;
import com.Insurance.Models.InscMstProductBranchCompKey;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscMstProductBranchRepository extends JpaRepository<InscMstProductBranch,InscMstProductBranchCompKey>{
	
	public Optional<InscMstProductBranch> findByImpbProductNo(String productno);

}
