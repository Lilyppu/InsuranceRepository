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

import com.Insurance.Models.InscTrnOrderOut;
import com.Insurance.Services.ServiceInscTrnOrderOut;

@RestController
public class ControllerInscTrnOrderOut {
	@Autowired
	ServiceInscTrnOrderOut servITOO;
	
	@GetMapping("/Insurance/getItooAll")
	public List<InscTrnOrderOut> getItooAll(){
		return servITOO.getItooAll();
	}
	
	@GetMapping("/Insurance/getItooByContractNoList")
	public List<InscTrnOrderOut> getItooByContractNoList(String contractno){
		return servITOO.getItooByContractNoList(contractno);
	}
}
