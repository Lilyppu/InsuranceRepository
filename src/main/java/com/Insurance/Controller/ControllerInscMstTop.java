package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstTop;
import com.Insurance.Services.ServiceInscMstTop;

@RestController
public class ControllerInscMstTop {
	
	@Autowired
	ServiceInscMstTop servInscMstTop;
	
	@GetMapping("/Insurance/getinsctoplistall")
	public List<InscMstTop> getinsctoplistall(){
		return servInscMstTop.getInscMstTopList();
	}

}
