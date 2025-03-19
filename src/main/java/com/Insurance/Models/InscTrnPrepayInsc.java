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
@Table(name= "insc_trn_prepay_insc")
public class InscTrnPrepayInsc {
	@Column (name="supl_code", length=10, nullable = false)
	private String itpiSuplCode;
	
	@Column (name="inv_type", length=10, nullable = false)
	private String itpiInvType;
	
	@Column (name="payment_via_bank", length=5, nullable = false)
	private String itpiPaymentViaBank;
	
	@Column (name="paid_by_ho", length=5, nullable = false)
	private String itpiStartDate;
	
	@Column (name="contract_no", length=20, nullable = false)
	private String itpiContractNo;
	
	@Column (name="plat_no", length=20)
	private String itpiPlatNo;
	
	@Column (name="engine_no", length=20)
	private String itpiEngineNo;
	
	@Column (name="chasis_no", length=20)
	private String itpiChasisNo;
	
	@Column (name="status", length=10)
	private String itpiStatus;
	
	@Column (name="created_by", length=10, nullable = false)
	private String itpiCreatedBy;
	
	@Column (name="created_date", nullable = false)
	private Date itpiCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String itpiModifiedBy;
	
	@Column (name="modified_date")
	private Date itpiModifiedDate;
	
	@Id
	@Column (name="cert_no", length=50, nullable = false)
	private String itpiCertNo;
	
	@Column (name="prepay_no", length=20, nullable = false)
	private String itpiPrepayNo;
	
	@Column (name="branch_id", length=10)
	private String itpiBranchId;
	
	@Column (name="coy_id", length=5)
	private String itpiCoyId;
}
