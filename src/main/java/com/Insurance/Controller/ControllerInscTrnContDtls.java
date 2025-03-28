package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscTrnContDtls;
import com.Insurance.Services.ServiceInscTrnContDtls;

@RestController
public class ControllerInscTrnContDtls {
	
	@Autowired
	ServiceInscTrnContDtls servItcd;
	
	@GetMapping("/Insurance/getContDtlsListAll")
	public List<InscTrnContDtls> getContDtlsList(){
		return servItcd.getContDtlsList();
	}
	
	@GetMapping("/Insurance/getContDtlsListByApplNo")
	public List<InscTrnContDtls> getContDtlsListByApplNo(String ApplNo){
		return servItcd.getContDtlsListByApplNo(ApplNo);
	}

}
