package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstPremi;
import com.Insurance.Services.ServiceInscMstPremi;

@RestController
public class ControllerInscMstPremi {
	
	@Autowired
	ServiceInscMstPremi servInscMstPremi;
	
	@GetMapping("/Insurance/getinscpremilistall")
	public List<InscMstPremi> getinscpremilistall(){
		return servInscMstPremi.getInscMstPremiList();
	}

}
