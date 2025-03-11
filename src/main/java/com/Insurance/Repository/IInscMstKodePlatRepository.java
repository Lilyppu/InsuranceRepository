package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscMstKodePlat;

import jakarta.transaction.Transactional;
public interface IInscMstKodePlatRepository extends JpaRepository<InscMstKodePlat,String>{
	
	public Optional<InscMstKodePlat> findByImkpKodePlat(String kodeplat);
}
