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

import com.Insurance.Models.InscMstStatOfClaim;
import com.Insurance.Services.ServiceInscMstStatOfClaim;

@RestController
public class ControllerInscMstStatOfClaim {
	@Autowired
	ServiceInscMstStatOfClaim servIMSOC;
	
	@GetMapping("/insc/getImsocAll")
	public List<InscMstStatOfClaim> getImsocAll(){
		return servIMSOC.getImsocAll();
	}
	
	@GetMapping("/insc/getImsocByCoverageIdCU")
	public Optional<InscMstStatOfClaim> getImsocByCoverageIdCU(String coverageid){
		return servIMSOC.getImsocByCoverageIdCU(coverageid);
	}
}
