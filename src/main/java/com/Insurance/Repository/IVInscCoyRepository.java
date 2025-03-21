package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.VInscCoy;

@Repository
public interface IVInscCoyRepository extends JpaRepository<VInscCoy,String>{
	
	public List<VInscCoy> findByvicVinscoyId(String InsCoyId);

}
