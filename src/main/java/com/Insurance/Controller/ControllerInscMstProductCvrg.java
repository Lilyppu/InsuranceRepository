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

import com.Insurance.Models.InscMstProductCvrg;
import com.Insurance.Services.ServiceInscMstProductCvrg;

@RestController
public class ControllerInscMstProductCvrg {
	@Autowired
	ServiceInscMstProductCvrg servIMPCG;
	
	@GetMapping("/Insurance/getImpcgAll")
	public List<InscMstProductCvrg> getImpcgAll(){
		return servIMPCG.getImpcgAll();
	}
	
	@GetMapping("/Insurance/getImpcgByProductNoList")
	public List<InscMstProductCvrg> getImpcgByProductNoList(String productno){
		return servIMPCG.getImpcgByProductNoList(productno);
	}
}
