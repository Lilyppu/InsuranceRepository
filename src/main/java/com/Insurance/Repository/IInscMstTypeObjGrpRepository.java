package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstTypeObjGrp;
import com.Insurance.Models.InscMstTypeObjGrpCompKey;

import jakarta.transaction.Transactional;
public interface IInscMstTypeObjGrpRepository extends JpaRepository<InscMstTypeObjGrp,InscMstTypeObjGrpCompKey>{
	
	public List<InscMstTypeObjGrp> findByImtogTypeIdContaining(String typeid);

}
