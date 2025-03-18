package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscMstPertanggungan;
import com.Insurance.Services.ServiceInscMstPertanggungan;

@RestController
public class ControllerInscMstPertanggungan {
	
	@Autowired
	ServiceInscMstPertanggungan servInscMstPertanggungan;
	
	@GetMapping("/Insurance/getinscpertgglistall")
	public List<InscMstPertanggungan> getinscpertgglistall(){
		return servInscMstPertanggungan.getInscMstPertggList();
	}
	
	@GetMapping("/Insurance/getinscpertggbycoyidlist")
	public List<InscMstPertanggungan> getinscpertggbycoyidlist(String CoyId){
		return servInscMstPertanggungan.getInscMstPertggByCoyId(CoyId);
	}

}
