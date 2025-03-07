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

import com.Insurance.Models.InscMstProduct;
import com.Insurance.Services.ServiceInscMstProduct;

@RestController
public class ControllerInscMstProduct {
	@Autowired
	ServiceInscMstProduct servIMPR;
	
	@GetMapping("/insc/getImsprAll")
	public List<InscMstProduct> getImprAll(){
		return servIMPR.getImprAll();
	}
	
	@GetMapping("/insc/getImprByProductNoCU")
	public Optional<InscMstProduct> getImprByProductNoCU(String productno){
		return servIMPR.getImprByProductNoCU(productno);
	}
}
