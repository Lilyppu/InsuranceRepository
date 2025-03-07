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

import com.Insurance.Models.InscMstProductRate;
import com.Insurance.Services.ServiceInscMstProductRate;

@RestController
public class ControllerInscMstProductRate {
	@Autowired
	ServiceInscMstProductRate servIMPRT;
	
	@GetMapping("/insc/getImprtAll")
	public List<InscMstProductRate> getImprtAll(){
		return servIMPRT.getImprtAll();
	}
	
	@GetMapping("/insc/getImprtByProductNoCU")
	public Optional<InscMstProductRate> getImprtByProductNoCU(String productno){
		return servIMPRT.getImprtByProductNoCU(productno);
	}
}
