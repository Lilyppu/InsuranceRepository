package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.InscMstType;

@Repository
public interface IInscMstTypeRepository extends JpaRepository<InscMstType,String>{

}
