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

import com.Insurance.Models.InscTrnRefundRsp;
import com.Insurance.Services.ServiceInscTrnRefundRsp;

@RestController
public class ControllerInscTrnRefundRsp {
	@Autowired
	ServiceInscTrnRefundRsp servITRR;
	
	@GetMapping("/Insurance/getItrrAll")
	public List<InscTrnRefundRsp> getItrrAll(){
		return servITRR.getItrrAll();
	}
	
	@GetMapping("/Insurance/getItrrByRefundNoCU")
	public Optional<InscTrnRefundRsp> getItrrByRefundNoCU(String refundno){
		return servITRR.getItrrByRefundNoCU(refundno);
	}
}
