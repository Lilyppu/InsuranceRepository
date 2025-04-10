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

import com.Insurance.Models.InscMstProductBranch;
import com.Insurance.Services.ServiceInscMstProductBranch;

@RestController
public class ControllerInscMstProductBranch {
	@Autowired
	ServiceInscMstProductBranch servIMPB;
	
	@GetMapping("/Insurance/getImpbAll")
	public List<InscMstProductBranch> getImpbAll(){
		return servIMPB.getImpbAll();
	}
	
	@GetMapping("/Insurance/getImpbByProductNoCU")
	public Optional<InscMstProductBranch> getImpbByProductNoCU(String productno){
		return servIMPB.getImpbByProductNoCU(productno);
	}
}
