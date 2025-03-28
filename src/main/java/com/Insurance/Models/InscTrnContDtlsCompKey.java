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
public class InscTrnContDtlsCompKey implements Serializable {
	
	private String itcdApplNo;
	private Integer itcdApplSeqNo;
	private Integer itcdTahun;
	private Date itcdPeriodFrom;
	private Integer itcdVersionNo;	
	private Integer itcdContractSeq;

}
