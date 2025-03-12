package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstCauseOfClaim;
import com.Insurance.Models.InscMstCauseOfClaimCompKey;

import jakarta.transaction.Transactional;
public interface IInscMstCauseOfClaimRepository extends JpaRepository<InscMstCauseOfClaim,InscMstCauseOfClaimCompKey>{
	
	public List<InscMstCauseOfClaim> findByImcocCoverageId(String coverageid);
}
