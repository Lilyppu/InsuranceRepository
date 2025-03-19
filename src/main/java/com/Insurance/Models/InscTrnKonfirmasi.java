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
@Table(name= "insc_trn_konfirmasi")
public class InscTrnKonfirmasi {
	@Id
	@Column (name="contract_no", length=20, nullable = false)
	private String itkContractNo;
	
	@Column (name="rv_deposit_no", length=20)
	private String itkRvDepositNo;
	
	@Column (name="claim_amount")
	private BigDecimal itkClaimAmount;
	
	@Column (name="branch_id", length=5)
	private String itkBranchId;
	
	@Column (name="created_by", length=10)
	private String itkCreatedBy;
	
	@Column (name="created_timestamp")
	private Date itkCreatedTimestamp;
	
	@Column (name="blokir_amount")
	private BigDecimal itkBlokirAmount;
	
	@Column (name="refund_amount")
	private BigDecimal itkRefundAmount;
	
	@Column (name="claim_received", length=1)
	private String itkClaimReceived;
	
	@Column (name="refund_received", length=1)
	private String itkRefundReceived;
	
	@Column (name="cert_no", length=50)
	private String itkCertNo;
	
	@Column (name="claim_received_date")
	private Date itkClaimReceivedDate;
	
	@Column (name="refund_received_date")
	private Date itkRefundReceivedDate;
}
