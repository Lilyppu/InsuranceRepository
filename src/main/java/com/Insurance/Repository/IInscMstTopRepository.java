package com.Insurance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Insurance.Models.InscMstTop;

@Repository
public interface IInscMstTopRepository extends JpaRepository<InscMstTop,Integer>{

}
