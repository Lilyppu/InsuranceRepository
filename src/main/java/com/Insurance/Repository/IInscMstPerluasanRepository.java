package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstPerluasan;
import com.Insurance.Models.InscMstCauseOfClaimCompKey;

import jakarta.transaction.Transactional;
public interface IInscMstPerluasanRepository extends JpaRepository<InscMstPerluasan,InscMstCauseOfClaimCompKey>{
	
	public List<InscMstPerluasan> findByImpanCoyId(String coyid);
}
