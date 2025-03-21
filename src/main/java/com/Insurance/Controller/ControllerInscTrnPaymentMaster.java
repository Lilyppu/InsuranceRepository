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

import com.Insurance.Models.InscTrnPaymentMaster;
import com.Insurance.Services.ServiceInscTrnPaymentMaster;

@RestController
public class ControllerInscTrnPaymentMaster {
	@Autowired
	ServiceInscTrnPaymentMaster servITPM;
	
	@GetMapping("/insc/getItpmAll")
	public List<InscTrnPaymentMaster> getItpmAll(){
		return servITPM.getItpmAll();
	}
	
	@GetMapping("/insc/getItpmByGroupNoCU")
	public Optional<InscTrnPaymentMaster> getItpmByGroupNoCU(String groupno){
		return servITPM.getItpmByGroupNoCU(groupno);
	}
}
