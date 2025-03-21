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

import com.Insurance.Models.InscTrnRefund;
import com.Insurance.Services.ServiceInscTrnRefund;

@RestController
public class ControllerInscTrnRefund {
	@Autowired
	ServiceInscTrnRefund servITR;
	
	@GetMapping("/insc/getItrAll")
	public List<InscTrnRefund> getItrAll(){
		return servITR.getItrAll();
	}
	
	@GetMapping("/insc/getItrByRefundNoCU")
	public Optional<InscTrnRefund> getItrByRefundNoCU(String refundno){
		return servITR.getItrByRefundNoCU(refundno);
	}
}
