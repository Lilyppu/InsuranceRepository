package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstType;
import com.Insurance.Services.ServiceInscMstType;

@RestController
public class ControllerInscMstType {
	
	@Autowired
	ServiceInscMstType servInscMstType;
	
	@GetMapping("/Insurance/getinsctypelistall")
	public List<InscMstType> getinsctypelistall(){
		return servInscMstType.getInscMstTypeList();
	}

}
