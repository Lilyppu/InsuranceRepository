package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Insurance.Models.InscTrnKonfirmasi;

import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
public interface IInscTrnKonfirmasiRepository extends JpaRepository<InscTrnKonfirmasi,String>{
	
	public Optional<InscTrnKonfirmasi> findByItkContractNo(String contractno);

}
