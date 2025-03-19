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

import com.Insurance.Models.InscTrnPrepayInscDtl;
import com.Insurance.Services.ServiceInscTrnPrepayInscDtl;

@RestController
public class ControllerInscTrnPrepayInscDtl {
	@Autowired
	ServiceInscTrnPrepayInscDtl servITPID;
	
	@GetMapping("/insc/getItpidAll")
	public List<InscTrnPrepayInscDtl> getItpidAll(){
		return servITPID.getItpidAll();
	}
	
	@GetMapping("/insc/getItpidByCertNoCU")
	public Optional<InscTrnPrepayInscDtl> getItpidByCertNoCU(String certno){
		return servITPID.getItpidByCertNoCU(certno);
	}
}
