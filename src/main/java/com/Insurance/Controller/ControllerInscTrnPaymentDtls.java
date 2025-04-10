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

import com.Insurance.Models.InscTrnPaymentDtls;
import com.Insurance.Services.ServiceInscTrnPaymentDtls;

@RestController
public class ControllerInscTrnPaymentDtls {
	@Autowired
	ServiceInscTrnPaymentDtls servITPD;
	
	@GetMapping("/Insurance/getItpdAll")
	public List<InscTrnPaymentDtls> getItpdAll(){
		return servITPD.getItpdAll();
	}
	
	@GetMapping("/Insurance/getItpdByGroupNoCU")
	public Optional<InscTrnPaymentDtls> getItpdByGroupNoCU(String groupno){
		return servITPD.getItpdByGroupNoCU(groupno);
	}
}
