package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.InscTrnContDtls;
import com.Insurance.Models.InscTrnContDtlsCompKey;

@Repository
public interface IInscTrnContDtlsRepository extends JpaRepository<InscTrnContDtls,InscTrnContDtlsCompKey>{
	
	public List<InscTrnContDtls> findByItcdApplNo(String ApplNo);

}
