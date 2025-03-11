package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstKodePlat;
import com.Insurance.Services.ServiceInscMstKodePlat;

@RestController
public class ControllerInscMstKodePlat {
	@Autowired
	ServiceInscMstKodePlat servIMKP;
	
	@GetMapping("/insc/getImkpAll")
	public List<InscMstKodePlat> getImkpAll(){
		return servIMKP.getImkpAll();
	}
	
	@GetMapping("/insc/getImkpByKodePlatCU")
	public Optional<InscMstKodePlat> getImkpByKodePlatCU(String kodeplat){
		return servIMKP.getImkpByKodePlatCU(kodeplat);
	}
}
