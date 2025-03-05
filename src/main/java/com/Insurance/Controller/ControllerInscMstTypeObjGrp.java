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

import com.Insurance.Models.InscMstTypeObjGrp;
import com.Insurance.Services.ServiceInscMstTypeObjGrp;

@RestController
public class ControllerInscMstTypeObjGrp {
	@Autowired
	ServiceInscMstTypeObjGrp servIMCT;
	
	@GetMapping("/insc/getImtogAll")
	public List<InscMstTypeObjGrp> getImtogAll(){
		return servIMCT.getImtogAll();
	}
	
	@GetMapping("/insc/getImtogByTypeIdCU")
	public Optional<InscMstTypeObjGrp> getImtogByTypeIdCU(String typeid){
		return servIMCT.getImtogByTypeIdCU(typeid);
	}
}
