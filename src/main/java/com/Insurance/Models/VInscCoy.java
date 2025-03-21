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
@Table(name= "V_INSC_COY")
public class VInscCoy {
	
	@Id
	@Column (name="vinscoy_id", length=5, nullable = false)
	private String vicVinscoyId;
	
	@Column (name="vinscoy_supp_code", length=12, nullable = false)
	private String vicVinscoySuppCode;
	
	@Column (name="vinscoy_sup_name", length=70)
	private String vicVinscoySupName;
	
	@Column (name="vinscoy_pct_netpremi")
	private BigDecimal vicVinscoyPctNetpremi;
	
	@Column (name="vinscoy_pic", length=100)
	private String vicVinscoyPic;
	
	@Column (name="vinscoy_createdby", length=10)
	private String vicVinscoyCreateBy;
	
	@Column (name="vinscoy_createddate")
	private Date vicVinscoyCreateDate;
	
	@Column (name="vinscoy_bankid", length=20)
	private String vicVinscoyBankId;
	
	@Column (name="vinscoy_bankname", length=60)
	private String vicVinscoyBankName;
	
	@Column (name="vinscoy_accntno1", length=8)
	private String vicVinscoyAccntNo1;
	
	@Column (name="vinscoy_accntno2", length=8)
	private String vicVinscoyAccntNo2;
	
	@Column (name="vinscoy_accntno3", length=8)
	private String vicVinscoyAccntNo3;
	
	@Column (name="vinscoy_accntno4", length=8)
	private String vicVinscoyAccntNo4;
	
	@Column (name="vinscoy_accntno5", length=8)
	private String vicVinscoyAccntNo5;
	
	@Column (name="vinscoy_mou_no", length=25)
	private String vicVinscoyMouNo;
	
	@Column (name="vinscoy_mou_date")
	private Date vicVinscoyMouDate;
	
	@Column (name="vinscoy_policy_no", length=20)
	private String vicVinscoyPolicyNo;
	
	@Column (name="vinscoy_policy_date")
	private Date vicVinscoyPolicyDate;
	
	@Column (name="vinscoy_address", length=120)
	private String vicVinscoyAddress;
	
	@Column (name="vinscoy_city", length=30)
	private String vicVinscoyCity;
	
	@Column (name="vinscoy_telp", length=30)
	private String vicVinscoyTelp;
	
	@Column (name="vinscoy_fax", length=30)
	private String vicVinscoyFax;	

}
