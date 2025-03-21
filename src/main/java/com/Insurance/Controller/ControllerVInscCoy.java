package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.VInscCoy;
import com.Insurance.Services.ServiceVInscCoy;

@RestController
public class ControllerVInscCoy {
	
	@Autowired
	ServiceVInscCoy servVinsCoy;
	
	@GetMapping("/Insurance/getVinsCoyListAll")
	public List<VInscCoy> getVinsCoyList(){
		return servVinsCoy.getVinsCoyList();
	}
	
	@GetMapping("/Insurance/getVinsCoyByInsCoyId")
	public List<VInscCoy> getVicVinsCoyId(String InsCoyId){
		return servVinsCoy.getVicVinsCoyId(InsCoyId);
	}

}
