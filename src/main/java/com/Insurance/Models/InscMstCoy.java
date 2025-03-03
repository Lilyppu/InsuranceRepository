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
@Table(name= "INSC_MST_COY")
public class InscMstCoy {
	
	@Id
	@Column (name="coy_id", length=5, nullable = false)
	private String imcCoyId;
	
	@Column (name="supplier_code", length=12)
	private String imcSupplierCode;
	
	@Column (name="pic_designation", length=100)
	private String imcPicDesignation;
	
	@Column (name="mou_no", length=25)
	private String imcMouNo;
	
	@Column (name="mou_date")
	private Date imcMouDate;
	
	@Column (name="policy_no", length=20)
	private String imcPolicyNo;
	
	@Column (name="policy_date")
	private Date imcPolicyDate;
	
	@Column (name="created_by", length=10)
	private String imcCeateBy;
	
	@Column (name="created_date")
	private Date imcCeateDate;
	
	@Column (name="modified_by", length=10)
	private String imcModifyBy;
	
	@Column (name="modified_date")
	private Date imcModifyDate;
	
	@Column (name="bank", length=20)
	private String imcBank;
	
	@Column (name="accntno1", length=8)
	private String imcAccntNo1;
	
	@Column (name="accntno2", length=8)
	private String imcAccntNo2;
	
	@Column (name="accntno3", length=8)
	private String imcAccntNo3;
	
	@Column (name="accntno4", length=8)
	private String imcAccntNo4;
	
	@Column (name="accntno5", length=8)
	private String imcAccntNo5;
	
	@Column (name="pct_net_premi")
	private BigDecimal imcPctNetPremi;
	
	@Column (name="pct_net_premi_pa")
	private BigDecimal imcPctNetPremiPa;

}
