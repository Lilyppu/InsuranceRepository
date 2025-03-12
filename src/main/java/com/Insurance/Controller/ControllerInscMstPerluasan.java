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

import com.Insurance.Models.InscMstPerluasan;
import com.Insurance.Services.ServiceInscMstPerluasan;

@RestController
public class ControllerInscMstPerluasan {
	@Autowired
	ServiceInscMstPerluasan servIMPAN;
	
	@GetMapping("/insc/getImpanAll")
	public List<InscMstPerluasan> getImpanAll(){
		return servIMPAN.getImpanAll();
	}
	
	@GetMapping("/insc/getImpanByCoyIdList")
	public List<InscMstPerluasan> getImpanByCoyIdList(String coyid){
		return servIMPAN.getImpanByCoyIdList(coyid);
	}
}
