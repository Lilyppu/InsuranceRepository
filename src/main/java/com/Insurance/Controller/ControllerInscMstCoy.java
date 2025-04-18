package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstCoy;
import com.Insurance.Services.ServiceInscMstCoy;

@RestController
public class ControllerInscMstCoy {
	
	@Autowired
	ServiceInscMstCoy servInscMstCoy;
	
	@GetMapping("/Insurance/getinsccoylistall")
	public List<InscMstCoy> getinsccoylistall(){
		return servInscMstCoy.getInscMstCoyList();
	}
	
	@GetMapping("/Insurance/getinsccoybycoyidlist")
	public List<InscMstCoy> getinsccoybycoyidlist(String CoyId){
		return servInscMstCoy.getInscMstCoyByCoyId(CoyId);
	}

}
