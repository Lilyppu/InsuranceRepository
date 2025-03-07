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
@Table(name= "insc_mst_product")
public class InscMstProduct {
	@Id
	@Column (name="product_no", length=20, nullable = false)
	private String imprProductNo;
	
	@Column (name="product_desc", length=50)
	private String imprProductDesc;
	
	@Column (name="coy_id", length=30)
	private String imprCoyId;
	
	@Column (name="type_id", length=240)
	private String imprTypeId;
	
	@Column (name="new_used", length=20)
	private String imprNewUsed;
	
	@Column (name="platform", length=10)
	private String imprPlatform;
	
	@Column (name="adm_refund_amt")
	private BigDecimal imprAdmRefundAmt;
	
	@Column (name="adm_endors_amt")
	private BigDecimal imprAdmEndorsAmt;
	
	@Column (name="stamp_duty_amt")
	private BigDecimal imprStampDutyAmt;
	
	@Column (name="policy_fee")
	private BigDecimal imprPolicyFee;
	
	@Column (name="adm_fee")
	private BigDecimal imprAdmFee;
	
	@Column (name="own_risk_pct")
	private Integer imprOwnRiskPct;
	
	@Column (name="start_date")
	private Date imprStartDate;
	
	@Column (name="end_date")
	private Date imprEndDate;
	
	@Column (name="created_by", length=10)
	private String imprCreatedBy;
	
	@Column (name="created_date")
	private Date imprCreatedDate;
	
	@Column (name="modified_by", length=10)
	private String imprModifiedBy;
	
	@Column (name="modified_date")
	private Date imprModifiedDate;
	
	@Column (name="cust_type", length=1)
	private String imprCustType;
	
	@Column (name="is_gc", length=1)
	private String imprIsGc;
	
	@Column (name="fif_coy_id", length=5)
	private String imprFifCoyId;
	
	@Column (name="penggunaan", length=20)
	private String imprPenggunaan;
	
	@Column (name="or_type", length=5)
	private String imprOrType;
	
	@Column (name="penalty")
	private BigDecimal imprPenalty;
	
	@Column (name="block_fee")
	private BigDecimal imprBlockFee;
	
	@Column (name="acc_fee")
	private BigDecimal imprAccFee;
	
	@Column (name="sim_penalty", length=2)
	private String imprSimPenalty;
	
	@Column (name="otr_from")
	private BigDecimal imprOtrFrom;
	
	@Column (name="otr_to")
	private BigDecimal imprOtrTo;
	
	@Column (name="refund_by_tenor", length=1)
	private String imprRefundByTenor;
	
	@Column (name="pct_jamin")
	private Integer imprPctJamin;
}
