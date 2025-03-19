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

import com.Insurance.Models.InscTrnPrepayInsc;
import com.Insurance.Services.ServiceInscTrnPrepayInsc;

@RestController
public class ControllerInscTrnPrepayInsc {
	@Autowired
	ServiceInscTrnPrepayInsc servITPI;
	
	@GetMapping("/insc/getItpiAll")
	public List<InscTrnPrepayInsc> getItpiAll(){
		return servITPI.getItpiAll();
	}
	
	@GetMapping("/insc/getItpiByCertNoCU")
	public Optional<InscTrnPrepayInsc> getItpiByCertNoCU(String certno){
		return servITPI.getItpiByCertNoCU(certno);
	}
}
