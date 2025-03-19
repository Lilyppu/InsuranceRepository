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

import com.Insurance.Models.InscTrnKonfirmasi;
import com.Insurance.Services.ServiceInscTrnKonfirmasi;

@RestController
public class ControllerInscTrnKonfirmasi {
	@Autowired
	ServiceInscTrnKonfirmasi servITK;
	
	@GetMapping("/insc/getItkAll")
	public List<InscTrnKonfirmasi> getItkAll(){
		return servITK.getItkAll();
	}
	
	@GetMapping("/insc/getItkByContractNoCU")
	public Optional<InscTrnKonfirmasi> getItkByContractNoCU(String contractno){
		return servITK.getItkByContractNoCU(contractno);
	}
}
