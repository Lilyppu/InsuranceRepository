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

import com.Insurance.Models.InscMstCoverageType;
import com.Insurance.Services.ServiceInscMstCoverageType;

@RestController
public class ControllerInscMstCoverageType {
	@Autowired
	ServiceInscMstCoverageType servIMCT;
	
	@GetMapping("/Insurance/getImctAll")
	public List<InscMstCoverageType> getImctAll(){
		return servIMCT.getImctAll();
	}
	
	@GetMapping("/Insurance/getImctByCoverageIdCU")
	public Optional<InscMstCoverageType> getImctByCoverageIdCU(String coverageid){
		return servIMCT.getImctByCoverageIdCU(coverageid);
	}
}
