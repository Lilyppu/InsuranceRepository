package com.Insurance.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InscTrnContCompKey implements Serializable {
	
	private String itcApplNo;
	private Integer itcApplSeqNo;
	private Integer itcContractSeq;

}
