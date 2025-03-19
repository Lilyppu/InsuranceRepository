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
@Table(name= "insc_trn_prepay_insc_dtl")
@IdClass(InscTrnPrepayInscDtlCompKey.class)
public class InscTrnPrepayInscDtl {
	@Id
	@Column (name="seq_no", nullable = false)
	private Integer itpidSeqNo;
	
	@Column (name="invoice_no", length=30)
	private String itpidInvoiceNo;
	
	@Column (name="amount_paid", nullable = false)
	private BigDecimal itpidAmountPaid;
	
	@Column (name="date_paid", nullable = false)
	private Date itpidDatePaid;
	
	@Column (name="description", length=500)
	private String itpidDescription;
	
	@Column (name="created_by", length=10, nullable = false)
	private String itpidCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date itpidCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String itpidModifiedBy;
	
	@Column (name="modified_date")
	private Date itpidModifiedDate;
	
	@Id
	@Column (name="cert_no", length=50, nullable = false)
	private String itpidCertNo;
	
	@Column (name="remain_amt")
	private BigDecimal itpidRemainAmount;
	
	@Column (name="status", length=2)
	private String itpidStatus;
}
