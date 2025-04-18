package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstStatOfClaim;
import com.Insurance.Models.InscMstStatOfClaimCompKey;

import jakarta.transaction.Transactional;
public interface IInscMstStatOfClaimRepository extends JpaRepository<InscMstStatOfClaim,InscMstStatOfClaimCompKey>{
	
	public List<InscMstStatOfClaim> findByImsocCoverageIdContaining(String coverageid);

}
