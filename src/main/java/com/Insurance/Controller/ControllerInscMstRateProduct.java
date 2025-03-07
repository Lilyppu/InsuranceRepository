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

import com.Insurance.Models.InscMstRateProduct;
import com.Insurance.Services.ServiceInscMstRateProduct;

@RestController
public class ControllerInscMstRateProduct {
	@Autowired
	ServiceInscMstRateProduct servIMRP;
	
	@GetMapping("/insc/getImrpAll")
	public List<InscMstRateProduct> getImprAll(){
		return servIMRP.getImrpAll();
	}
	
	@GetMapping("/insc/getImrpByCoyIdList")
	public List<InscMstRateProduct> getImrpByCoyIdList(String coyid){
		return servIMRP.getImrpByCoyIdList(coyid);
	}
}
