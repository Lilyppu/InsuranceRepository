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
@Table(name= "INSC_TRN_CONT")
@IdClass(InscTrnContCompKey.class)
public class InscTrnCont {
	
	@Id
	@Column (name="appl_no", length=20, nullable = false)
	private String itcApplNo;
	
	@Id
	@Column (name="appl_seq_no", nullable = false)
	private Integer itcApplSeqNo;
	
	@Column (name="cert_no", length=50)
	private String itcCertNo;
	
	@Column (name="type_id", length=30)
	private String itcTypeId;
	
	@Column (name="credit_or_no", length=1)
	private String itcCreditOrNo;
	
	@Column (name="contract_no", length=20)
	private String itcContractNo;
	
	@Column (name="product_no", length=20)
	private String itcProductNo;
	
	@Column (name="new_used", length=1)
	private String itcNewUsed;
	
	@Column (name="coy_id", length=5)
	private String itcCoyId;
	
	@Column (name="hrg_pertg")
	private BigDecimal itcHrgPertg;
	
	@Column (name="rate_no", length=20)
	private String itcRateNo;
	
	@Column (name="net_amt")
	private BigDecimal itcNetAmt;
	
	@Column (name="unit_amt")
	private BigDecimal itcUnitAmt;
	
	@Column (name="top")
	private Integer itcTop;
	
	@Column (name="from_date")
	private Date itcFromDate;
	
	@Column (name="to_date")
	private Date itcToDate;
	
	@Column (name="cert_date")
	private Date itcCertDate;
	
	@Column (name="print_count")
	private Integer itcPrintCount;
	
	@Column (name="paid_flag", length=1)
	private String itcPaidFlag;
	
	@Column (name="status", length=2)
	private String itcStatus;
	
	@Column (name="policy_no", length=50)
	private String itcPolicyNo;
	
	@Column (name="polis_name", length=100)
	private String itcPolisName;	
	
	@Column (name="polis_addr", length=200)
	private String itcPolisAddr;	
	
	@Column (name="polis_city", length=100)
	private String itcPolisCity;	
	
	@Column (name="obj_code", length=20)
	private String itcObjCode;	
	
	@Column (name="obj_brand", length=30)
	private String itcObjBrand;	
	
	@Column (name="obj_model", length=30)
	private String itcObjModel;	
	
	@Column (name="obj_mfg_year")
	private Integer itcMfgYear;	
	
	@Column (name="obj_color", length=30)
	private String itcObjColor;	
	
	@Column (name="obj_engine_no", length=50)
	private String itcObjEngineNo;	
	
	@Column (name="obj_frame_no", length=50)
	private String itcObjFrameNo;	
	
	@Column (name="obj_plat_no", length=20)
	private String itcObjPlatNo;	
	
	@Column (name="ar_group_number", length=13)
	private String itcArGroupNumber;	
	
	@Column (name="ar_send_date")
	private Date itcArSendDate;	
	
	@Column (name="ar_seq_no")
	private Integer itcArSeqNo;	
	
	@Column (name="endors_seq")
	private Integer itcEndorsSeq;	
	
	@Column (name="disburse_date")
	private Date itcDisburseDate;	
	
	@Column (name="b2b_flag", length=1)
	private String itcB2bFlag;	
	
	@Column (name="created_by", length=10)
	private String itcCreateBy;	
	
	@Column (name="created_date")
	private Date itcCreateDate;	
	
	@Column (name="modified_by", length=10)
	private String itcModifyBy;	
	
	@Column (name="modified_date")
	private Date itcModifyDate;	
	
	@Column (name="ar_total_amount")
	private BigDecimal itcArTotalAmount;	
	
	@Column (name="policy_date")
	private Date itcPolicyDate;	
	
	@Column (name="coverage_id", length=30)
	private String itcCoverageId;	
	
	@Column (name="fif_coy_id", length=5)
	private String itcFifCoyId;	
	
	@Column (name="platform", length=15)
	private String itcPlatform;	
	
	@Column (name="obj_premi_amt")
	private BigDecimal itcObjPremiAmt;	
	
	@Column (name="branch_id", length=10)
	private String itcBranchId;	
	
	@Column (name="claim_refund_status", length=3)
	private String itcClaimRefundStatus;	
	
	@Column (name="obj_titipan_amt")
	private BigDecimal itcObjTitipanAmt;	
	
	@Column (name="depo_ins_date")
	private Date itcDepoInsDate;	
	
	@Column (name="depo_close_date")
	private Date itcDepoCloseDate;	
	
	@Column (name="polis_zip", length=20)
	private String itcPolisZip;	
	
	@Column (name="print_date")
	private Date itcPrintDate;	
	
	@Id
	@Column (name="contract_seq", nullable = false)
	private Integer itcContractSeq;
	
	@Column (name="bank_jf", length=20)
	private String itcBankJf;	

}
