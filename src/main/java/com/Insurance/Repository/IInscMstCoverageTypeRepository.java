package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstCoverageType;

import jakarta.transaction.Transactional;
public interface IInscMstCoverageTypeRepository extends JpaRepository<InscMstCoverageType,String>{
	
	public Optional<InscMstCoverageType> findByImctCoverageId(String coverageid);

}
