package com.Insurance.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "insc_trn_premi")
@IdClass(InscTrnPremiCompKey.class)
public class InscTrnPremi {
	@Id
	@Column (name="appl_no", length=20, nullable = false)
	private String itpApplNo;
	
	@Id
	@Column (name="appl_seq_no", length=20, nullable = false)
	private String itpApplSeqNo;
	
	@Column (name="contract_no", length=20, nullable = false)
	private String itpContractNo;
	
	@Column (name="premi_amt")
	private BigDecimal itpPremiAmt;
	
	@Column (name="coy_id", length=20, nullable = false)
	private String itpCoyId;
	
	@Column (name="product_no", length=20, nullable = false)
	private String itpProductNo;
	
	@Column (name="group_no", length=20)
	private String itpGroupNo;
	
	@Column (name="ap_invoice_no", length=20)
	private String itpApInvoiceNo;
	
	@Column (name="created_by", length=10, nullable = false)
	private String itpCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date itpCreatedDate;
	
	@Column (name="modified_by", length=240)
	private String itpModifiedBy;
	
	@Column (name="modified_date")
	private Date itpModifiedDate;
}
