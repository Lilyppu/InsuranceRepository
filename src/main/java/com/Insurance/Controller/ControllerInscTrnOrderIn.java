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

import com.Insurance.Models.InscTrnOrderIn;
import com.Insurance.Services.ServiceInscTrnOrderIn;

@RestController
public class ControllerInscTrnOrderIn {
	@Autowired
	ServiceInscTrnOrderIn servITOI;
	
	@GetMapping("/insc/getItoiAll")
	public List<InscTrnOrderIn> getItoiAll(){
		return servITOI.getItoiAll();
	}
	
	@GetMapping("/insc/getItoiByContractNoCU")
	public Optional<InscTrnOrderIn> getItoiByContractNoCU(String contractno){
		return servITOI.getItoiByContractNoCU(contractno);
	}
}
