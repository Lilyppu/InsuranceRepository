package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.InscMstPertanggungan;
import com.Insurance.Models.InscMstPertanggunganCompKey;

@Repository
public interface IInscMstPertanggunganRepository extends JpaRepository<InscMstPertanggungan,InscMstPertanggunganCompKey>{
	
	public List<InscMstPertanggungan> findByImptgCoyId(String CoyId);

}
