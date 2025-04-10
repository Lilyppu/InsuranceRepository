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

import com.Insurance.Models.InscMstCauseOfClaim;
import com.Insurance.Services.ServiceInscMstCauseOfClaim;

@RestController
public class ControllerInscMstCauseOfClaim {
	@Autowired
	ServiceInscMstCauseOfClaim servIMCOC;
	
	@GetMapping("/Insurance/getImcocAll")
	public List<InscMstCauseOfClaim> getImcocAll(){
		return servIMCOC.getImcocAll();
	}
	
	@GetMapping("/Insurance/getImcocByCoverageIdList")
	public List<InscMstCauseOfClaim> getImcocByCoverageIdList(String coverageid){
		return servIMCOC.getImcocByCoverageIdList(coverageid);
	}
}
