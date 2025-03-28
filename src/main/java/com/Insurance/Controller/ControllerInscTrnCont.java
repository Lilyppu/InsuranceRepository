package com.Insurance.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance.Models.InscTrnCont;
import com.Insurance.Services.ServiceInscTrnCont;

@RestController
public class ControllerInscTrnCont {
	
	@Autowired
	ServiceInscTrnCont servInscTrnCont;
	
	@GetMapping("/Insurance/getinsccontlistall")
	public List<InscTrnCont> getinsccontlistall(){
		return servInscTrnCont.getInscTrnContList();
	}
	
	@GetMapping("/Insurance/getinsccontbyapplnoapplseqnocontseqlist")
	public List<InscTrnCont> getinsccontbyapplnoapplseqnocontseqlist(String ApplNo, Integer SeqNo, Integer ContSeq){
		return servInscTrnCont.getInsTrnContByApplNoApplSeqNoContSeq(ApplNo, SeqNo, ContSeq);
	}

}
