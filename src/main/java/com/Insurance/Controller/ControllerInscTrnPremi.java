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

import com.Insurance.Models.InscTrnPremi;
import com.Insurance.Services.ServiceInscTrnPremi;

@RestController
public class ControllerInscTrnPremi {
	@Autowired
	ServiceInscTrnPremi servITP;
	
	@GetMapping("/Insurance/getItpAll")
	public List<InscTrnPremi> getItpAll(){
		return servITP.getItpAll();
	}
	
	@GetMapping("/Insurance/getItpByApplNoCU")
	public Optional<InscTrnPremi> getItpByApplNoCU(String applno){
		return servITP.getItpByApplNoCU(applno);
	}
}
